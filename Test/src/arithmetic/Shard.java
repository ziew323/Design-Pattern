package arithmetic;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Shard<S> { // S类封装了机器节点的信息 ，如name、password、ip、port等  

    private TreeMap<Long, S> nodes; // 虚拟节点  

    private List<S> shards; // 真实机器节点  

    private final int NODE_NUM = 100; // 每个机器节点关联的虚拟节点个数  

    public static void main(String[] args) {
        int count = 3;
        List<Server> servers = new ArrayList<Server>();
        for (int i = 0; i < count; i++) {
            Server server = new Server("server" + i, "" + i, "127.0.0.1", 7000 + i);
            servers.add(server);
        }
        Shard<Server> shard = new Shard<Server>(servers);
        for (int i = 0; i < 100; i++) {
            System.out.println("key=" + i + ",server=" + shard.getShardInfo("" + i));
        }
        System.out.println(shard.nodes.size());
    }

    public Shard(List<S> shards) {
        super();
        this.shards = shards;
        init();
    }

    private void init() { // 初始化一致性hash环  
        nodes = new TreeMap<Long, S>();
        for (int i = 0; i != shards.size(); ++i) { // 每个真实机器节点都需要关联虚拟节点  
            final S shardInfo = shards.get(i);

            for (int n = 0; n < NODE_NUM; n++)
                // 一个真实机器节点关联NODE_NUM个虚拟节点  
                nodes.put(hash("SHARD-" + i + "-NODE-" + n), shardInfo);

        }
    }

    public S getShardInfo(String key) {
        SortedMap<Long, S> tail = nodes.tailMap(hash(key)); // 沿环的顺时针找到一个虚拟节点  
        if (tail.size() == 0) {
            return nodes.get(nodes.firstKey());
        }
        return tail.get(tail.firstKey()); // 返回该虚拟节点对应的真实机器节点的信息  
    }

    public void add(S shard) {

    }

    public void remove(S shard) {

    }

    /** 
     *  MurMurHash算法，是非加密HASH算法，性能很高， 
     *  比传统的CRC32,MD5，SHA-1（这两个算法都是加密HASH算法，复杂度本身就很高，带来的性能上的损害也不可避免） 
     *  等HASH算法要快很多，而且据说这个算法的碰撞率很低. 
     *  http://murmurhash.googlepages.com/ 
     */
    private Long hash(String key) {

        ByteBuffer buf = ByteBuffer.wrap(key.getBytes());
        int seed = 0x1234ABCD;

        ByteOrder byteOrder = buf.order();
        buf.order(ByteOrder.LITTLE_ENDIAN);

        long m = 0xc6a4a7935bd1e995L;
        int r = 47;

        long h = seed ^ (buf.remaining() * m);

        long k;
        while (buf.remaining() >= 8) {
            k = buf.getLong();

            k *= m;
            k ^= k >>> r;
            k *= m;

            h ^= k;
            h *= m;
        }

        if (buf.remaining() > 0) {
            ByteBuffer finish = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
            // for big-endian version, do this first:  
            // finish.position(8-buf.remaining());  
            finish.put(buf).rewind();
            h ^= finish.getLong();
            h *= m;
        }

        h ^= h >>> r;
        h *= m;
        h ^= h >>> r;

        buf.order(byteOrder);
        return h;
    }

    public static class Server {
        private String name;
    
        private String password;
    
        private String ip;
    
        private int port;
    
        public Server(String name, String password, String ip, int port) {
            super();
            this.name = name;
            this.password = password;
            this.ip = ip;
            this.port = port;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getPassword() {
            return password;
        }
    
        public void setPassword(String password) {
            this.password = password;
        }
    
        public String getIp() {
            return ip;
        }
    
        public void setIp(String ip) {
            this.ip = ip;
        }
    
        public int getPort() {
            return port;
        }
    
        public void setPort(int port) {
            this.port = port;
        }
    
        @Override
        public String toString() {
            return "Server [name=" + name + ", password=" + password + ", ip=" + ip + ", port=" + port + "]";
        }
    
    }

}
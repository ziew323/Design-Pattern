package arithmetic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 假设淘宝一天有5亿条成交数据，求出销量最高的100个商品并给出算法的时间复杂度。</br></br>
 * 
 * 1.数据无法全部放入内存
 * @author jiaziwei
 *
 */
public class TopSaleNum {
    public static void main(String[] args) {
        int maxId = 99;
        TopSaleNum topSaleNum = new TopSaleNum();
        for (int i = 0; i < maxId; i += TopSaleNum.count) {
            List<Sku> skus = topSaleNum.getNextSkus(i);
            topSaleNum.pushSkus(skus);
        }
        topSaleNum.printTops();
    }

    private static int count = 100;

    private static int bound = 100000;

    private Random random = new Random(new Date().getTime());

    private List<Sku> tops = new ArrayList<Sku>();

    public void pushSkus(List<Sku> skus) {
        for (int i = 0; i < skus.size(); i++) {
            pushSku(skus.get(i));
        }
    }

    private void pushSku(Sku sku) {
        tops.add(new Sku(-1, -1));
        int i = tops.size() - 1;
        while (i > 0 && sku.getNum() > tops.get(i - 1).getNum()) {
            tops.get(i).setId(tops.get(i - 1).getId());
            tops.get(i).setNum(tops.get(i - 1).getNum());
            i--;
        }
        tops.get(i).setId(sku.getId());
        tops.get(i).setNum(sku.getNum());
        if (tops.size() > count) {
            tops.remove(count);
        }
    }

    public void printTops() {
        int size = tops.size();
        for (int i = 0; i < count; i++) {
            if (i < size && tops.get(i) != null) {
                System.out.println("top " + (i + 1) + ":" + tops.get(i));
            } else {
                break;
            }

        }
    }

    public List<Sku> getNextSkus(int startId) {
        List<Sku> skus = new ArrayList<Sku>();
        for (int i = 0; i < count; i++) {
            Sku sku = new Sku(startId + i, random.nextInt(bound));
            System.out.println(sku);
            skus.add(sku);
        }
        return skus;
    }

    class Sku {
        private int id;

        private int num;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public Sku(int id, int num) {
            this.id = id;
            this.num = num;
        }

        @Override
        public String toString() {
            return "Sku [id=" + id + ", num=" + num + "]";
        }

    }
}

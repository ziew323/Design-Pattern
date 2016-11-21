package pattern.compare.behavior.dns.chain;

import java.util.Random;

public abstract class DnsServer {
    private DnsServer upperServer;

    public final Recorder resolve(String domain) {
        Recorder recorder = null;
        if (isLocal(domain)) {
            recorder = echo(domain);
        } else {
            recorder = upperServer.resolve(domain);
        }
        return recorder;
    }

    public void setUpperServer(DnsServer upperServer) {
        this.upperServer = upperServer;
    }

    protected abstract boolean isLocal(String domain);

    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
        recorder.setIp(getIpAddress());
        recorder.setDomain(domain);
        return recorder;
    }

    private String getIpAddress() {
        Random rand = new Random();
        String address = rand.nextInt(255) + "." + rand.nextInt(255) + "." + rand.nextInt(255) + "."
            + rand.nextInt(255);
        return address;
    }
}

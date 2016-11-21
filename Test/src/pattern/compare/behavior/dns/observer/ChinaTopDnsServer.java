package pattern.compare.behavior.dns.observer;

public class ChinaTopDnsServer extends DnsServer {

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("china top dns server");
    }

    @Override
    protected boolean ifLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".cn");
    }

}

package pattern.compare.behavior.dns.observer;

public class TopDnsServer extends DnsServer {

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("global top dns server");
    }

    @Override
    protected boolean ifLocal(Recorder recorder) {
        return true;
    }

}

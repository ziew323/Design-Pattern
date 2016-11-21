package pattern.compare.behavior.dns.observer;

public class SHDnsServer extends DnsServer {

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("shanghai dns server");
    }

    @Override
    protected boolean ifLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".sh.cn");
    }

}

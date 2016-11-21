package pattern.compare.behavior.dns.chain;

public class SHDnsServer extends DnsServer {

    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".sh.cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("shanghai dns server");
        return recorder;
    }

}

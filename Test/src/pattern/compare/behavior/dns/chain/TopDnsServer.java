package pattern.compare.behavior.dns.chain;

public class TopDnsServer extends DnsServer {

    @Override
    protected boolean isLocal(String domain) {
        return true;
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("global top dns server");
        return recorder;
    }

}

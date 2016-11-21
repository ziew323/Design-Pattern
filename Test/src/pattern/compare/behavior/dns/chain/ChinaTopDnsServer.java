package pattern.compare.behavior.dns.chain;

public class ChinaTopDnsServer extends DnsServer {

    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("china top dns server");
        return recorder;
    }

}

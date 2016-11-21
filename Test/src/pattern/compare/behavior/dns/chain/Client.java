package pattern.compare.behavior.dns.chain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        DnsServer sh = new SHDnsServer();
        DnsServer china = new ChinaTopDnsServer();
        DnsServer top = new TopDnsServer();

        china.setUpperServer(top);
        sh.setUpperServer(china);
        while (true) {
            String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if (domain.equalsIgnoreCase("exit")) {
                return;
            }
            Recorder recorder = sh.resolve(domain);
            System.out.println(recorder);
        }
    }
}

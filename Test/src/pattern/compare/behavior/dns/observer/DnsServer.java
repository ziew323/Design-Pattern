package pattern.compare.behavior.dns.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public abstract class DnsServer extends Observable implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Recorder recorder = (Recorder) arg;
        if (ifLocal(recorder)) {
            recorder.setIp(getIpAddress());
        } else {
            responseFromUpperServer(recorder);
        }
        sign(recorder);
    }

    public void setUpperServer(DnsServer dnsServer) {
        super.deleteObservers();
        super.addObserver(dnsServer);
    }

    protected abstract void sign(Recorder recorder);

    private void responseFromUpperServer(Recorder recorder) {
        super.setChanged();
        super.notifyObservers(recorder);
    }

    private String getIpAddress() {
        Random rand = new Random();
        String address = rand.nextInt(255) + "." + rand.nextInt(255) + "." + rand.nextInt(255) + "."
            + rand.nextInt(255);
        return address;
    }

    protected abstract boolean ifLocal(Recorder recorder);

}

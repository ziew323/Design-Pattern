package pattern.compare.behavior.dns.observer;

public class Recorder {
    private String domain;

    private String ip;

    private String owner;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("domain:").append(this.domain).append("\nip:" + this.ip).append("\nowner:")
            .append(this.owner);
        return str.toString();
    }
}

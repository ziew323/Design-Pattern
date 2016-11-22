package pattern.compare.cross.mail.bridge;

public abstract class MailServer {
    protected final MailTemplate m;

    public MailServer(MailTemplate m) {
        this.m = m;
    }

    public void sendMail() {
        System.out.println("from:" + m.getFrom());
        System.out.println("to:" + m.getTo());
        System.out.println("subject:" + m.getSubject());
        System.out.println("context:" + m.getContext());
    }
}

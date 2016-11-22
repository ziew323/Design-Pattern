package pattern.compare.cross.mail.bridge;

public class SendMail extends MailServer {

    public SendMail(MailTemplate m) {
        super(m);
    }

    @Override
    public void sendMail() {
        super.m.add("Received: (sendmail); 2016-11-22 10:40:04");
        super.sendMail();
    }

}

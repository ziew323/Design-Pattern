package pattern.compare.cross.mail.bridge;

public class Postfix extends MailServer {

    public Postfix(MailTemplate m) {
        super(m);
    }

    @Override
    public void sendMail() {
        String context = "Received: from XXXX (unknown [xxx.xxx.xxx.xxx]) by aaa.aaa.com (Postfix) whth ESMTP id abcd\n";
        super.m.add(context);
        super.sendMail();
    }

}

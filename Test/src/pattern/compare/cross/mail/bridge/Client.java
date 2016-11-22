package pattern.compare.cross.mail.bridge;

public class Client {
    public static void main(String[] args) {
        MailTemplate m = new HtmlMail("a@a.com", "b@b.com", "this is a subject", "this is the context");
        MailServer mail = new Postfix(m);
        mail.sendMail();
    }
}

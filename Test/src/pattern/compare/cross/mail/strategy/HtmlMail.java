package pattern.compare.cross.mail.strategy;

public class HtmlMail extends MailTemplate {

    public HtmlMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }

    public String getContext() {
        String context = "\nContent-Type: mutlipart/mixed; charset=GB2312\n" + super.getContext();
        context += "\ntype: multipart";
        return context;
    }

}

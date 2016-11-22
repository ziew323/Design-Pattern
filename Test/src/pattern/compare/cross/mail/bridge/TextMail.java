package pattern.compare.cross.mail.bridge;

public class TextMail extends MailTemplate {

    public TextMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }

    public String getContext() {
        String context = "\nContent-Type: text/plain;charset=GB2312\n" + super.getContext();
        context += "\ntype: text";
        return context;
    }

}

package code.academy;

public class Email {

    private String to;
    private String subject;
    private String body;
    private Status status;

    Email(String to, String subject, String body){
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.status = Status.NEW;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

package code.academy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail(emails());

    }

    static List<Email> emails() {
        return new ArrayList<>()
        {
            {
                add(new Email("Receiver1@email.com", "code", "java"));
                add(new Email("Receiver2@email.com", "code", "python"));
                add(new Email("Receiver3@email.com", "code", "C++"));
                add(new Email("Receiver4@email.com", "code", "ruby"));
            }
        };
    }
}

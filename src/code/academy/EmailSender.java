package code.academy;

import java.util.ArrayList;
import java.util.List;

public class EmailSender {

    public void sendEmail(List<Email> emails) {

        ArrayList<Email> resendingEmails = new ArrayList<>();
        while (!emails.isEmpty()) {
            for (Email email : emails) {
                try {
                    if (email.getStatus().equals(Status.RESENDING)) {
                        System.out.println(String.format("RESENDING email to: %s", email.getTo()));
                    } else {
                        System.out.println(String.format("SENDING email to: %s", email.getTo()));
                    }
                    NetworkConnector.send(email);
                    email.setStatus(Status.SENT);
                    System.out.println(String.format("SUCCESSFULLY sent email to: %s", email.getTo()));
                } catch (NoNetworkException e) {
                    email.setStatus(Status.RESENDING);
                    resendingEmails.add(email);
                    System.out.println(String.format("FAILED to send email to: %s", email.getTo()));
                }
            }
            emails = resendingEmails;
            resendingEmails = new ArrayList<>();
            System.out.println();
            if (!emails.isEmpty()) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ignore) { }
            }
        }

    }

}


//
//    teruoja laiškus ir po vieną siunčia. Siuntimui kviečia klasės NetworkConnector metodą send.
//        Jei laiško išsiuntimas yra nesėkmingas (klaida NoNetworkException, kurios klasę taip
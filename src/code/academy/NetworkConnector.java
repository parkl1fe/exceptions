package code.academy;

import java.util.Random;

class NetworkConnector {

    public static void send(Object o) throws NoNetworkException {

        Random rand = new Random();
        int n = rand.nextInt(10);
        try {
            int i = 1 / n;
        } catch (ArithmeticException e) {
            throw new NoNetworkException();
        }
    }
}
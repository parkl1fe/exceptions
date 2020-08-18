package code.academy;


public class Income {
    private final double sum;
    private static int index;
    private final String date;
    private final Transaction transactionType;
    private final String additionalInformation;

    public Income(double sum, Transaction transactionType, String additionalInformation) {
        this.sum = sum;
        index++;
        this.date = DateTimeHelper.getDateTime();
        this.transactionType = transactionType;
        this.additionalInformation = additionalInformation;
    }

    public double getSum() {
        return sum;
    }

    public static int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return String.format("Transaction index: %s, sum: %s, made on: %s, Transaction type: %s, AdditionalInfo: %s",
                index, sum, date, transactionType, additionalInformation);
    }
}
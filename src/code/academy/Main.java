package code.academy;

public class Main {


    public static void main(String[] args) {

        Account account = new Account();
        Expenses expenses1 = new Expenses(12.43, Transaction.CASH, "MasterCard");
        Expenses expenses2 = new Expenses(12.43, Transaction.CASH, "MasterCard");
        Expenses expenses3 = new Expenses(12.43, Transaction.CASH, "MasterCard");
        account.addExpenses(expenses1);
        account.addExpenses(expenses2);
        account.addExpenses(expenses3);



        account.addIncome(new Income(120.234, Transaction.CASH, "Refund"));
        account.addExpenses(new Expenses(111.43, Transaction.CASH, "MasterCard"));
        account.addExpenses(new Expenses(122.00, Transaction.CASH, "MasterCard"));
        account.addIncome(new Income(1200.234, Transaction.CASH, "Refund"));

        account.getExpensesReport();
        System.out.println("################\n");
        account.getIncomeReport();

        System.out.println("################\n");

        account.getExpenseTransaction(2);
        account.getIncomeTransaction(1);



    }
}

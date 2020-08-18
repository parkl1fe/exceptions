package code.academy;

public class Account {

    private Income[] incomeList = new Income[100];
    private Expenses[] expensesList = new Expenses[100];

    public void addIncome(Income income) {
        incomeList[Income.getIndex() -1] = income;
    }

    public void addExpenses(Expenses expenses) {
        expensesList[Expenses.getIndex() -1] = expenses;
    }

    public void getIncomeReport() {
        double total = 0;
        for (int i = 0; i <= Income.getIndex() - 1; i++ ) {
            System.out.println(incomeList[i].toString());
            total += incomeList[i].getSum();
            System.out.println(String.format("TOTAL income, %.2f, in %s transactions", total, Income.getIndex()));
        }
    }

    public void getExpensesReport() {
        double total = 0;
        for (int e = 0; e <= Expenses.getIndex() -1; e++ ) {
            System.out.println(expensesList[e].toString());
            total += expensesList[e].getSum();
            System.out.println(String.format("TOTAL expenses, -%.2f, in %s transactions", total, Expenses.getIndex()));
        }
    }

    public void getExpenseTransaction(int index) {
        System.out.println(expensesList[index].toString());
    }

    public void getIncomeTransaction(int index) {
        System.out.println(incomeList[index].toString());
    }
}

package entities;

public class Account {

    private static Integer COUNT_AGENCY=1;
    private static Integer COUNT_NUMBER=1;

    protected Integer agency=COUNT_AGENCY;
    protected Integer number=COUNT_NUMBER++;
    protected String name;
    protected Double balance;

    public Account() {
    }

    public Account( String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw (double amount){
        balance -= amount;
    }

    public void deposit (double amount){
        balance += amount;
    }

    public void transfer (double amount, Account accountDeposit){
        this.withdraw(amount);
        accountDeposit.deposit(amount);

    }

    public void updateBalance(){

    }


    public String extract() {
        return "Account{" +
                " agency=" + agency +
                ",number=" + number +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

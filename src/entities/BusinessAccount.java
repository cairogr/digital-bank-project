package entities;

public class BusinessAccount extends Account {
    private double loanLimit;

    public BusinessAccount( ) {

    }

    public BusinessAccount(String name, Double balance, double loanLimit) {
        super(name, balance);
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void transfer(double amount, Account accountDeposit) {
        super.transfer(amount, accountDeposit);
    }

    @Override
    public String extract() {
        return super.extract();
    }

    public void loan(double amount) {

    }
}

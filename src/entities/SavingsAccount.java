package entities;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount() {

    }

    public SavingsAccount( String name, Double balance, double interestRate) {
        super( name, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount-1);
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
}

package entities;

public class BusinessAccount extends Account {

    public BusinessAccount() {
    }

    public BusinessAccount(String name, Double balance, Double loanLimite) {
        super(name, balance, loanLimite);
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


}

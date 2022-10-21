package entities;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private static Integer COUNT_AGENCY = 1;
    private static Integer COUNT_NUMBER = 1;

    protected Integer agency = COUNT_AGENCY;
    protected Integer number = COUNT_NUMBER++;
    protected String name;
    protected Double balance;
    protected Double loanLimite;

    private List<Account> accountList = new ArrayList<>();

    public Account() {
    }

    public Double getLoanLimite() {
        return loanLimite;
    }

    public Account(String name, Double balance, Double loanLimite) {
        this.name = name;
        this.balance = balance;
        this.loanLimite = loanLimite;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void transfer(double amount, Account accountDeposit) {
        this.withdraw(amount);
        accountDeposit.deposit(amount);

    }

    public void updateBalance() {

    }

    public String getName() {
        return name;
    }

    public Integer getAgency() {
        return agency;
    }

    public Integer getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void addAccount(Account acc) {
        accountList.add(acc);
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public String extract() {
        StringBuilder sb = new StringBuilder();
        for (Account acc : accountList) {
            sb.append(acc.getAccountList());
        }
        return sb.toString();
                /*"Account{" +
                " agency=" + agency +
                ",number=" + number +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';*/
    }
}

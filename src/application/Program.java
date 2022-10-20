package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account c1 = new SavingsAccount("Cairo", 1000.00, 1.00);
        Account c2 = new BusinessAccount("Cairo", 1000.00, 10.00);



    }
}

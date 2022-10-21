package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Account> accountList = new ArrayList<>();

        System.out.println("How many accounts will be registered:");
        Integer n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            input.nextLine();
            System.out.print("Holder Account: ");
            String name = input.nextLine();
            System.out.print("Balance Account: ");
            Double balance = input.nextDouble();
            System.out.print("Limite Account: ");
            Double loan = input.nextDouble();

            Account acc = new BusinessAccount(name, balance, loan);
            accountList.add(acc);

        }


        for (Account acc : accountList) {
            System.out.println("Account{" +
                    " agency=" + acc.getAgency() +
                    ",number=" + acc.getNumber() +
                    ", name='" + acc.getName() + '\'' +
                    ", balance=" + acc.getBalance() +
                    ", limite=" + acc.getLoanLimite() +
                    '}');
        }

        input.close();
    }
}

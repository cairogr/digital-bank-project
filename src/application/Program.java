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
        Integer n=5;


        do {
            System.out.println(" ###    MENU   ### ");
            System.out.println("-------------------");
            System.out.println("1 - REGISTER");
            System.out.println("2 - PRINT ALL ACCOUNTS");
            System.out.println("0 - FINISH");
            n = input.nextInt();

            switch (n) {

                case 1:

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

                    break;

                case 2:
                    for (Account acc1 : accountList) {
                        System.out.println("Account{" + " agency=" +
                                acc1.getAgency() + ",number=" +
                                acc1.getNumber() + ", name='" +
                                acc1.getName() + '\'' + ", balance=" +
                                acc1.getBalance() + ", limite=" +
                                acc1.getLoanLimite() + '}');
                    }

                    break;

                case 0:

                    break;

                default:
                    System.out.println("Invalid Command!");

            }

        }while (n!=0);
        //for (int i = 0; i < n; i++) {
        input.close();
    }

}


package application;

import entities.Account;
import exceptions.DomainException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
      
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter account data");
    System.out.printf("Number: ");
    int number = sc.nextInt();
    System.out.printf("Holder: ");
    sc.nextLine();
    String holder = sc.nextLine();
    System.out.printf("Initial balance: ");
    Double balance = sc.nextDouble();
    System.out.printf("Withdraw limit: ");
    Double withdrawLimit = sc.nextDouble();

    Account account = new Account(number, holder, balance, withdrawLimit);

    System.out.println();

    System.out.printf("Enter amount for withdraw: ");
    Double amount = sc.nextDouble();
    
    try {
      account.withdraw(amount);
      System.out.printf("New balance: %.2f", account.getBalance());
    } 
    catch(DomainException e) {
      System.out.println("Withdraw error: " + e.getMessage());
    }
    catch (RuntimeException e) {
      System.out.println("Unexpected error");
    }

    sc.close();
  }
}

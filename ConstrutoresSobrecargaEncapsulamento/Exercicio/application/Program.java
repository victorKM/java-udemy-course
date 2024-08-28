package application;

import entities.ContaBancaria;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter account number: ");
      int numero = sc.nextInt();
      System.out.print("Enter account holder: ");
      sc.nextLine();
      String nome = sc.nextLine();
      System.out.print("Is there an initial deposit (y/n)? ");
      char resposta = sc.next().charAt(0);

      ContaBancaria conta;

      if(resposta == 'y') {
        System.out.printf("Enter initial deposit value: ");
        double valorInicial = sc.nextDouble();
        conta = new ContaBancaria(numero, nome, valorInicial);
      } else {
        conta = new ContaBancaria(numero, nome);
      }

      System.out.println("\nAccount data");
      System.out.println(conta.toString());

      System.out.printf("\nEnter a deposit value: ");
      double valorDeposito = sc.nextDouble();
      conta.deposito(valorDeposito);
      System.out.println("Updated account data");
      System.out.println(conta.toString());

      System.out.printf("\nEnter a withdraw value: ");
      double valorSaque = sc.nextDouble();
      conta.saque(valorSaque);
      System.out.println("Updated account data");
      System.out.println(conta.toString());

      sc.close();
  }
}

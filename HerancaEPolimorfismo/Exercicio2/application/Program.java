package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
  public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number of tax payers: ");
      int n = sc.nextInt();

      List<Pessoa> list = new ArrayList<>();

      for (int i = 1; i <= n; i++) {
        System.out.println("Tax payer #" + i + " data:");
        System.out.print("Individual or company (i/c): ");
        char ch = sc.next().charAt(0);

        if (ch == 'i') {
          System.out.print("Name: ");
          sc.nextLine();
          String name = sc.nextLine();
          System.out.print("Anual income: ");
          double anualIncome = sc.nextDouble();
          System.out.print("Health expenditures: ");
          double healthExpenditures = sc.nextDouble();

          Pessoa p = new PessoaFisica(name, anualIncome, healthExpenditures);

          list.add(p);
        } else {
          System.out.print("Name: ");
          sc.nextLine();
          String name = sc.nextLine();
          System.out.print("Anual income: ");
          double anualIncome = sc.nextDouble();
          System.out.print("Number of employees: ");
          int numberEmployees = sc.nextInt();

          Pessoa p = new PessoaJuridica(name, anualIncome, numberEmployees);

          list.add(p);
        }
      }

      System.out.println();
      System.out.println("TAXES PAID:");
      double sum = 0.0;
      for (Pessoa p : list) {
        System.out.printf("%s: $ %.2f\n", p.getNome(), p.imposto());
        sum += p.imposto();
      }

      System.out.println();
      System.out.printf("TOTAL TAXES: $ %.2f\n", sum);

      sc.close();
  }
}

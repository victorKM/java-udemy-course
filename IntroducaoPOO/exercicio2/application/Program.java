package IntroducaoPOO.exercicio2.application;

import IntroducaoPOO.exercicio2.entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      Employee e1 = new Employee();

      System.out.printf("Name: ");
      e1.name = sc.nextLine();
      System.out.printf("Gross salary: ");
      e1.grossSalary = sc.nextDouble();
      System.out.printf("Tax: ");
      e1.tax = sc.nextDouble();

      System.out.println();
      System.out.printf("Employee: %s, $ %.2f\n\n", e1.name, e1.NetSalary());
      System.out.printf("Whice percentage to increase salary? ");
      double percentage = sc.nextDouble();
      System.out.println();

      e1.increaseSalary(percentage);
  }
}

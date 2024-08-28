import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.ListResourceBundle;

public class Program {
  public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      List<Employee> list = new ArrayList<>();

      System.out.println("Enter the number of employees:");
      int n = sc.nextInt();

      for(int i = 1; i<=n; i++) {
        System.out.println("Employee #" + i + " data:");
        System.out.print("Outsourced (y/n)? ");
        char resp = sc.next().charAt(0);
        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Hours: ");
        int horas = sc.nextInt();
        System.out.print("Value per hour: ");
        double valorPorHora = sc.nextDouble();

        if(resp == 'y'){
          System.out.print("Additional charge: ");
          double valorAdicional = sc.nextDouble();
          Employee emp = new OutsourcedEmployee(nome, horas, valorPorHora, valorAdicional);
          list.add(emp);
        } else {
          Employee emp = new Employee(nome, horas, valorPorHora);
          list.add(emp);
        }
      }

      System.out.println();
      System.out.println("PAYMENTS:");
      for(Employee emp : list) {
        System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
      }

      sc.close();
  }
}

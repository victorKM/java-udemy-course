package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
  public static void main(String[] args) {
      
    Locale.setDefault(Locale.US);
    Scanner sc =  new Scanner(System.in);

    System.out.printf("How many employees will be registred? ");
    int n = sc.nextInt();
    List<Employee> employees = new ArrayList<>();

    System.out.println();
    for (int i = 1; i <= n; i++) {
      System.out.println("Employee #" + i + ": ");
      System.out.printf("Id: ");
      int id = sc.nextInt();
      while(hasId(employees, id)) {
        System.out.println("Id already take. Try again: ");
        id = sc.nextInt();
      }

      System.out.printf("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.printf("Salary: ");
      double salary = sc.nextDouble();

      employees.add(new Employee(id, name, salary));
      System.out.println();
    } 

    System.out.printf("Enter the employee id that will have salary increase: ");
    int id = sc.nextInt();
    Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    if(emp == null) {
      System.out.println("This id does not exist!");
    } else {
      System.out.printf("Enter the percentage: ");
      double percentage = sc.nextDouble();
      emp.increaseSalary(percentage);
    }

    System.out.println();
    System.out.println("List of employees: ");
    for (Employee employee : employees) {
      System.out.println(employee);
    }

    sc.close();
  }

  public static boolean hasId(List<Employee> employees, int id) {
    Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null; 
  }
}

package IntroducaoPOO.exercicio2.entities;

public class Employee {
  public String name;
  public double grossSalary;
  public double tax;

  public double NetSalary() {
    return grossSalary - tax;
  }

  public void increaseSalary(double percentage) {
    System.out.printf("Update data: %s, $ %.2f", name, NetSalary() + (grossSalary*percentage/100));
  }
}

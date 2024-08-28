package IntroducaoPOO.exercicio3.application;

import IntroducaoPOO.exercicio3.entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      Student s1 = new Student();
      
      s1.name = sc.nextLine();
      s1.nota1 = sc.nextDouble();
      s1.nota2 = sc.nextDouble();
      s1.nota3 = sc.nextDouble();

      System.out.printf("FINAL GRADE = %.2f\n", s1.grade());
      s1.pass();
  }
}

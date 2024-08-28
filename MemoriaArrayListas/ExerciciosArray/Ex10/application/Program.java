package application;

import entities.Person;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
      
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.printf("Quantos alunos serao digitados? ");
    Integer n = sc.nextInt();
    Person[] vect = new Person[n];

    for(int i = 0; i < vect.length; i++) {
      System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
      sc.nextLine();
      String name = sc.nextLine();
      Double grade1 = sc.nextDouble();
      Double grade2 = sc.nextDouble();
      vect[i] = new Person(name, grade1, grade2);
    }

    System.out.println("Alunos aprovados: ");
    for(int i = 0; i < vect.length; i++) {
      if(vect[i].getAverage() >= 6.0) {
        System.out.println(vect[i].getName());
      }
    }

    sc.close();
  }
}
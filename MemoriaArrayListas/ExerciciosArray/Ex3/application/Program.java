package application;

import entities.Person;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.printf("Quantas pessoas serao digitadas? ");
      Integer n = sc.nextInt();

      Person[] vect = new Person[n];

      for(int i = 0; i < vect.length; i++) {
          System.out.println("Dados da " + (i+1) + "a pessoa:");
          System.out.printf("Nome: ");
          sc.nextLine();
          String name = sc.nextLine();
          System.out.printf("Idade: ");
          Integer age = sc.nextInt();
          System.out.printf("Altura: ");
          Double height = sc.nextDouble();

          vect[i] = new Person(name, age, height);
      }

      System.out.println();

      Integer count = 0;
      Double sum = 0.0;

      for(int i = 0; i < vect.length; i++) {
        sum += vect[i].getHeight();
        if(vect[i].getAge() < 16) {
          count++;
        }
      }

      System.out.printf("Altura media: %.2f\n", sum/(double)vect.length);
      System.out.printf("Pessoas com menos de 16 anos: %.1f%%", (count/(double)vect.length)*100);
      System.out.println();

      for(int i = 0; i < vect.length; i++) {
        if(vect[i].getAge() < 16) {
          System.out.println(vect[i].getName());
        }
      }

      sc.close();
  }
}

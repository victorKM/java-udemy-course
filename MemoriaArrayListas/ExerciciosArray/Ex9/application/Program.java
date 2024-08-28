package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Program {
  public static void main(String[] args) {
      
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.printf("Quantas pessoas voce vai digitar? ");
    Integer n = sc.nextInt();
    Person[] vect = new Person[n];
    Integer max = 0;
    Integer index = 0;

    for(int i = 0; i < vect.length; i++){
      System.out.println("dados da " + (i+1) + "a pessoa:");
      System.out.printf("Nome: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.printf("Idade: ");
      Integer age = sc.nextInt();
      vect[i] = new Person(name, age);
    }

    for(int i = 0; i < vect.length; i++){
      if(i == 0) {
        max = vect[i].getAge();
        index = i;
      } else {
        if(vect[i].getAge() > max) {
          max = vect[i].getAge();
          index = i;
        }
      }
    }

    System.out.println("PESSOA MAIS VELHAA: " + vect[index].getName());

    sc.close();
  }
}

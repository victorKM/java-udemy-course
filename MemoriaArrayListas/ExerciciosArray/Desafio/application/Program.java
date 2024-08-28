package application;

import entities.Person;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    System.out.printf("How many rooms will be rented? ");
    Integer n = sc.nextInt();
    Person[] vect = new Person[10];

    System.out.println();
    for(int i = 0; i < n; i++) {
      System.out.println("Rent #" + (i+1) + ":");
      System.out.printf("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.printf("Email: ");
      String email = sc.nextLine();
      System.out.printf("Room: ");
      Integer room = sc.nextInt();

      vect[room] = new Person(name, email);

      System.out.println();
    }

    System.out.println("Busy rooms: ");
    for (int i = 0; i < vect.length; i++) {
        if(vect[i] != null) {
          System.out.printf("%d: %s", i, vect[i]);
          System.out.println();
        }
    }

    sc.close();
  }
}

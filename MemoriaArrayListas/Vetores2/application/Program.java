package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    Product[] vect = new Product[3];

    for (int i = 0; i < vect.length; i++) {
      sc.nextLine();
      String name = sc.nextLine();
      Double price = sc.nextDouble();

      vect[i] = new Product(name, price);
    }

    Double average = 0.0;

    for (int i = 0; i < vect.length; i++) {
      average += vect[i].getPrice();
    }

    average = average/(double) vect.length;

    System.out.printf("AVERAGE PRICE = %.2f", average);

    sc.close();
  }
}
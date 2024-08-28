package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
  public static void main(String[] args) {
      
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of products: ");
    int n = sc.nextInt();
    List<Product> list = new ArrayList<>();

    for(int i = 1; i <= n; i++) {
       System.out.println("Product #" + i + " data:");
       System.out.print("Common, used or imported (c/u/i)? ");
       char ch = sc.next().charAt(0);

       if (ch == 'i') {
          System.out.printf("Name: ");
          sc.nextLine();
          String name = sc.nextLine();
          System.out.printf("Price: ");
          Double price = sc.nextDouble();
          System.out.printf("Customs fee: ");
          Double customsFee = sc.nextDouble();

          Product p = new ImportedProduct(name, price, customsFee);
          list.add(p);
       } else if (ch == 'u') {
          System.out.printf("Name: ");
          sc.nextLine();
          String name = sc.nextLine();
          System.out.printf("Price: ");
          Double price = sc.nextDouble();
          System.out.printf("Manufacture data (DD/MM/YYYY): ");
          sc.nextLine();
          String date = sc.nextLine();

          Product p = new UsedProduct(name, price, date);
          list.add(p);
       } else {
        System.out.printf("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.printf("Price: ");
        Double price = sc.nextDouble();

        Product p = new Product(name, price);
        list.add(p);
       }
    }

    System.out.println();
    System.out.println("PRICE TAGS:");
    for (Product p : list) {
      System.out.println(p.priceTag());
    }

    sc.close();
  }
}

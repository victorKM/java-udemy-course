package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter client data: ");

      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Email: ");
      String email = sc.next();
      System.out.print("Birth date(DD/MM/YYYY): ");
      sc.nextLine();
      String birthDate = sc.nextLine();
      System.out.println("Enter order data: ");
      System.out.print("Status: ");
      OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

      Order order = new Order(new Date(), orderStatus, new Client(name, email, birthDate));

      System.out.print("How many items to this order? ");
      int n = sc.nextInt();

      for (int i = 1; i <= n; i++) {
        System.out.println("Enter #" + i + " item data:");
        System.out.print("Product name: ");
        sc.nextLine();
        String productName = sc.nextLine();
        System.out.print("Product price: ");
        Double productPrice = sc.nextDouble();
        System.out.print("Quantity: ");
        Integer quantity = sc.nextInt();

        order.addItem(new OrderItem(quantity, productPrice, new Product(productName, productPrice)));
      }

      System.out.println();
      System.out.println("ORDER SUMMARY:");
      System.out.println(order.toString());
  }
}

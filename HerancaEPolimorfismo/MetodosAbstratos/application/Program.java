package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
  public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number of shapes: ");
      int n = sc.nextInt();

      List<Shape> list = new ArrayList<>();

      for(int i = 1; i <= n; i++) {
        System.out.println("Shape #" + i + " data:");
        System.out.print("Rectangle or Circle (r/c)? ");
        char ch = sc.next().charAt(0);
        System.out.print("Color (BLACK/BLUE/RED)? ");
        sc.nextLine();
        Color color = Color.valueOf(sc.next());

        if(ch == 'r'){
          System.out.print("Width: ");
          Double width = sc.nextDouble();
          System.out.print("Height: ");
          Double height = sc.nextDouble();

          list.add(new Rectangle(color, width, height));
        } else {
          System.out.print("Radius: ");
          Double radius = sc.nextDouble();

          list.add(new Circle(color, radius));
        }
      }

      for (Shape s : list) {
        System.out.println(String.format("%.2f", s.area()));
      }

      sc.close();
  }
}

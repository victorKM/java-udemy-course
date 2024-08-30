package application;

import entities.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    String pathRead = "./file.csv";
    String pathWrite = "./out/summary.csv";
    List<Product> products = new ArrayList<>();

    File newDir = new File("./out");
    if (!newDir.exists()) {
      newDir.mkdirs();
    }
      
    try(BufferedReader br = new BufferedReader(new FileReader(pathRead))) {

      String line = br.readLine();

      while(line != null) {
        String[] values = line.split(",");
        String name = values[0];
        Double price = Double.valueOf(values[1]);
        Integer quantity = Integer.valueOf(values[2]);

        products.add(new Product(name, price, quantity));

        line = br.readLine();
      }

      try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathWrite))) {

        for (Product p : products) {
          bw.write(p.toString());
          bw.newLine();
        }

        System.out.println(pathWrite + " CREATED!");
      } 
      catch (IOException e) {
        System.out.println("Erro writing file: " + e.getMessage());
      }

    } 
    catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    }
  }
}

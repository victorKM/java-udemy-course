package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

  public static void main(String[] args) {
      
    Locale.setDefault(Locale.US);
    List<Product> list = new ArrayList<>();

    list.add(new Product("TV", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    /* IMPLEMENTACAO DA INTERFACE PREDICATE */
    // list.removeIf(new ProductPredicate());

    /* REFERENCE METHOD COM METODO ESTATICO */
    // list.removeIf(Product::staticProductPredicate);

    /* REFERENCE METHOD COM METODO NAO ESTATICO */
    // list.removeIf(Product::nonStaticProductPredicate);

    /* EXPRESSAO LAMBDA DECLARADA */
    // double min = 100.0;
    // Predicate<Product> pred = p -> p.getPrice() >= min;
    // list.removeIf(pred);

    /* EXPRESSAO LAMBDA INLINE */
    double min = 100.0;
    list.removeIf(x -> x.getPrice() >= 100);

    for (Product p : list) {
      System.out.println(p);
    }

  }

}
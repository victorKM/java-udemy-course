import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    
    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");

    list.add(2, "Marco");

    System.out.println(list.size());
    for (String obj : list) {
      System.out.println(obj);
    }

    list.remove("Anna");
    list.remove(1);
    
    // Remover elemento que comece com M
    list.removeIf(x -> x.charAt(0) == 'M');

    list.add("Anna");
    list.add("Amanda");

    System.out.println("-------------------------");
    System.out.println(list.size());
    for (String obj : list) {
      System.out.println(obj);
    }

    // Printar o index de um elemento especifico
    System.out.println("Index of Bob: " + list.indexOf("Bob"));

    // Retornar uma lista que so tenha nome que comece com A
    List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

    System.out.println("-------------------------");
    for (String obj : result) {
      System.out.println(obj);
    }

    // Encontrar primeiro elemento que comece com A
    System.out.println("-------------------------");
    String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    System.out.println(name);
  }
}
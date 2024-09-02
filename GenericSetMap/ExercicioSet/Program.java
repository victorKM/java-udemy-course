import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    Set<Integer> a = new TreeSet<>();
    Set<Integer> b = new TreeSet<>();
    Set<Integer> c = new TreeSet<>();

    System.out.print("How many students for course A? ");
    int number = sc.nextInt();

    for (int i = 0; i < number; i++) {
      int value = sc.nextInt();
      a.add(value);
    }

    System.out.print("How many students for course B? ");
    number = sc.nextInt();

    for (int i = 0; i < number; i++) {
      int value = sc.nextInt();
      b.add(value);
    }

    System.out.print("How many students for course C? ");
    number = sc.nextInt();

    for (int i = 0; i < number; i++) {
      int value = sc.nextInt();
      c.add(value);
    }

    Set<Integer> d = new TreeSet<>(a);
    d.addAll(b);
    d.addAll(c);

    System.out.println("Total students: " + d.size());

    sc.close();

  }

}
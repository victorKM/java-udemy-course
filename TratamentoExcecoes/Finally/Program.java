import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    
    File file = new File("C:\\Users\\Victor\\Desktop\\Faculdade\\JavaUdemy\\TratamentoExcecoes\\in.txt");
    Scanner sc = null;

    try {
        sc = new Scanner(file);
        while(sc.hasNextLine()) {
          System.out.println(sc.nextLine());
        }
    } catch (FileNotFoundException e) {
      System.out.println("Error opening file: " + e.getMessage());
    } finally {
      System.out.println("Block finally executed!");
      if (sc != null) {
        sc.close();
      }
    }
  }
}
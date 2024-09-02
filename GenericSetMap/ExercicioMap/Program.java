import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    System.out.printf("Enter file full path: ");
    String path = sc.nextLine();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      Map<String, Integer> votes = new LinkedHashMap<>();
      
      String line = br.readLine();

      while(line != null) {
        String[] fields = line.split(",");
        String name = fields[0];
        int vote = Integer.parseInt(fields[1]);

        if (votes.containsKey(name)) {
          votes.put(name, votes.get(name)+vote);
        } else {
          votes.put(name, vote);
        }

        line = br.readLine();
      }

      for(String name : votes.keySet()) {
        System.out.println(name + ": " + votes.get(name));
      }

    }
    catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
 
    sc.close();
  }

}

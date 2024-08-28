
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.printf("Quantos valores vai ter cada vetor? ");
    Integer n = sc.nextInt();

    Integer[] vect1 = new Integer[n];
    Integer[] vect2 = new Integer[n];
    Integer[] vect3 = new Integer[n];

    System.out.println("Digite os valores do vetor A:");
    for(int i = 0; i < vect1.length; i++) {
      vect1[i] = sc.nextInt();
      vect3[i] = vect1[i];
    }
    System.out.println("Digite os valores do vetor B:");
    for(int i = 0; i < vect1.length; i++) {
      vect2[i] = sc.nextInt();
      vect3[i] += vect2[i];
    }
    System.out.println("VETOR RESULTANTE:");
    for(int i = 0; i < vect1.length; i++) {
      System.out.println(vect3[i]);
    }

    sc.close();
  }
}

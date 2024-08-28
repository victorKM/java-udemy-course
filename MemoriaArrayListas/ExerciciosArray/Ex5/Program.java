import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
      
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.printf("Quantos numeros voce vai digitar? ");
    Integer n = sc.nextInt();

    Double[] vect = new Double[n];

    Double max = 0.0;
    Integer index = 0;

    for(int i = 0; i < vect.length; i++) {
        System.out.printf("Digite um numero: ");
        Double number = sc.nextDouble();
        if(i == 0) {
          max = number;
          index = i;
        } else {
          if(number > max) {
            max = number;
            index = i;
          }
        }
    }

    System.out.println();
    System.out.printf("MAIOR VALOR = %.1f\n", max);
    System.out.printf("POSICAO DO MAIOR VALOR = %d", index);

    sc.close();
  }
}
package Secao_5;

import java.util.Locale;
import java.util.Scanner;

public class Aula39 {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    String dia;
    int x = sc.nextInt();

    switch(x) {
      case 1:
        dia = "domingo";
        break;
      case 2:
        dia = "segunda";
        break; 
      case 3:
        dia = "terca";
        break; 
      case 4:
        dia = "quarta";
        break; 
      case 5:
        dia = "quinta";
        break;
      case 6:
        dia = "sexta";
        break;
      case 7:
        dia = "sabado";
        break;  
      default:
        dia = "valor invalido";
        break; 
    }

    System.out.println("Dia da semana: " + dia);

    sc.close();
  }
}

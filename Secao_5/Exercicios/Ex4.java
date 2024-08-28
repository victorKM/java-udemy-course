package Secao_5.Exercicios;

import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);

      int horaInicial = sc.nextInt();
      int horaFinal = sc.nextInt();

      if(horaInicial == horaFinal) {
        System.out.println("O JOGO DUROU 24 HORA(S)");
      } else if(horaInicial < horaFinal) {
        System.out.printf("O JOGO DUROU %d HORA(S)", horaFinal - horaInicial);
      } else {
        System.out.printf("O JOGO DUROU %d HORA(S)", (24-horaInicial)+horaFinal);
      }

      sc.close();
  }
}


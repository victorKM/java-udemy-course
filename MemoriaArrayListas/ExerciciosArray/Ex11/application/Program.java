package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {
  public static void main(String[] args) {
      
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.printf("Quantas pessoas serao digitas? ");
    Integer n = sc.nextInt();
    Person[] vect = new Person[n];

    Double max = 0.0;
    Double min = 0.0;
    Integer sumF = 0;
    Double sumHeightF = 0.0;
    Integer sumM = 0;

    for (int i = 0; i < vect.length; i++) {
        System.out.printf("Altura da %da pessoa: ", i+1);
        Double height = sc.nextDouble();
        System.out.printf("Genero da %da pessoa: ", i+1);
        Character gender = sc.next().charAt(0);
        vect[i] = new Person(height, gender);
    }

    max = vect[0].getHeight();
    min = vect[0].getHeight();

    for (int i = 0; i < vect.length; i++) {
        if(vect[i].getGender() == 'M') {
          sumM++;
        } else {
          sumF++;
          sumHeightF += vect[i].getHeight();
        }

        if(vect[i].getHeight() > max) {
          max = vect[i].getHeight();
        }

        if(vect[i].getHeight() < min) {
          min = vect[i].getHeight();
        }
    }

    System.out.printf("Menor altura = %.2f\n", min);
    System.out.printf("Maior altura = %.2f\n", max);
    System.out.printf("Media das alturas das mulheres = %.2f\n", sumHeightF/(double)sumF);
    System.out.printf("Numero de homens = %d\n", sumM);

    sc.close();
  }
}

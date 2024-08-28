package Secao_4;

import java.util.Locale;

public class Aula24 {
  public static void main(String[] args){

    //Diferenca entre println e print
    System.out.println("Hello world!");
    System.out.println("Good morning!");
    System.out.printf("Good morning!");

    int y = 24;
    System.out.println(y);

    double x = 10.35784;
    System.out.printf("%.2f\n",x);
    System.out.printf("%.4f\n",x);

    //Mudar a representacao do numero decimal com virgular para com ponto
    Locale.setDefault(Locale.US);
    System.out.printf("%.2f\n",x);
    System.out.printf("%.4f\n",x);

    //Concatenar varios elementos usando println
    System.out.println("RESULTADOS = " + x + " METROS");

    //Concatenar varios elementos usando printf
    System.out.printf("RESULTADO = %.2f metros\n", x);

    //Concatenar varios elementos em um mesmo comando de escrita
    String nome = "Victor";
    int idade = 21;
    double renda = 0.0;
    System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
  }
  
}

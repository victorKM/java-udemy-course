package Funcoes;

public class FuncoesString {
  public static void main(String[] args) {
    
    String original = "abcde FGHIJ ABC abc DEFG   ";

    String s01 = original.toLowerCase();
    String s02 = original.toUpperCase();
    String s03 = original.trim();
    String s04 = original.substring(2);
    String s05 = original.substring(2, 9);
    String s06 = original.replace('a', 'x');
    String s07 = original.replace("abc", "xy");
    int i = original.indexOf("bc");
    int j = original.lastIndexOf("bc");

    System.out.println("Original: -" + original + "-");
    //-abcde FGHIJ ABC abc DEFG   -

    System.out.println("toLowerCase: -" + s01 + "-");
    //-abcde fghij abc abc defg   -

    System.out.println("toUpperCase: -" + s02 + "-");
    //-ABCDE FGHIJ ABC ABC DEFG   -

    System.out.println("trim: -" + s03 + "-");
    //-abcde FGHIJ ABC abc DEFG-

    System.out.println("substring(2): -" + s04 + "-");
    //-cde FGHIJ ABC abc DEFG   -

    System.out.println("substring(2,9): -" + s05 + "-");
    //-cde FGH-

    System.out.println("replace('a', 'x'): -" + s06 + "-");
    //-xbcde FGHIJ ABC xbc DEFG   -

    System.out.println("replace('abc', 'xy'): -" + s07 + "-");
    // -xyde FGHIJ ABC xy DEFG   -

    System.out.println("indexOf('bc'): -" + i + "-");
    //-1-

    System.out.println("lastIndexOf('bc'): -" + j + "-");
    //-17-


    String s = "potato apple lemon";
    String[] vect = s.split(" ");
    System.out.println(vect[0]);
    System.out.println(vect[1]);
    System.out.println(vect[2]);
    /*
     * potato
     * apple
     * lemon
     */
  }
}

// Formatar: toLowerCase(), toUpperCase(), trim()
// Recortar: substring(inicio), substring(inicio, fim)
// Substituir: replace(char, char), replace(string, string)
// Buscar: IndexOf, LastIndexOf
// str.Split("")

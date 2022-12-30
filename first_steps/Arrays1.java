package first_steps;

import java.util.Arrays;

public class Arrays1 {
  public static void main(String[]args) {
    int[] numeros = new int[5]; // tamanho dos arrays é imutável
    // indices [0] [1] [2] [3] [4]
    numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;

    for (int i=0; i < numeros.length; i++) {
      System.out.println(numeros[i]);
    }

    String[] letras = { "A", "B", "C", "D", "E" };
    System.out.println(Arrays.toString(letras));
    double bla = 2.5;
    System.out.println(++bla);
    for(int i=1; i<=10; i++) System.out.println(++i);
  }  
}

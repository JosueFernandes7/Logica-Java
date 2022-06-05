package Listas.Lista8;

import java.util.Scanner;

// método simplificado
public class Ex06 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    String palavra = in.next();
    for (int i = 0; i < palavra.length(); i++) {
      char letra = palavra.charAt(i);
      System.out.print(letra + " ");

    }
  }
}
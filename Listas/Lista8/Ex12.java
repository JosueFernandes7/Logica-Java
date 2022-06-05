package Listas.Lista8;

import java.util.Scanner;

public class Ex12 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int[] idades = new int[10];
    int maiores = 0, menores = 0;
    for (int i = 0; i < idades.length; i++) {
      System.out.print((i + 1) + " Idade: ");
      idades[i] = in.nextInt();
      if (idades[i] >= 18)
        maiores++;
      else
        menores++;
    }
    System.out.println(maiores + " maior(es) de 18");
    System.out.println(menores + " menor(es) de 18");

  }
}

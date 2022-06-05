package Listas.Lista8Complementar;

import java.util.Scanner;

public class Ex08 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] v1 = new int[10];
    int[] v2 = new int[10];
    int[] v_Final = new int[10];
    for (int i = 0; i < v1.length; i++) {
      System.out.print("v1[" + i + "] = ");
      v1[i] = in.nextInt();
    }
    System.out.println("\nVetor 2");
    for (int i = 0; i < v2.length; i++) {
      System.out.print("v2[" + i + "] = ");
      v2[i] = in.nextInt();
    }
    System.out.println("\nVetor FINAL");
    int cont = 0;
    for (int i = 0; i < v_Final.length; i++) {
      for (int j = 0; j < v_Final.length; j++) {
        if (v1[i] == v2[j]) {
          v_Final[cont] = v1[i];
          System.out.println("Final[" + cont + "] = " + v_Final[cont]);
          cont++;
          break;
        }
      }
    }

  }
}

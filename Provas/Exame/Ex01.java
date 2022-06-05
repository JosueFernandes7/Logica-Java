package Provas.Exame;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] v1 = new int[5];
    int[] v2 = new int[5];
    int[] v3 = new int[5];
    int[] v_Resultante = new int[5];

    System.out.println("Vetor 1");
    for (int i = 0; i < v1.length; i++) {
      System.out.print("V1[" + i + "] = ");
      v1[i] = in.nextInt();
    }

    System.out.println("Vetor 2");
    for (int i = 0; i < v2.length; i++) {
      System.out.print("V2[" + i + "] = ");
      v2[i] = in.nextInt();
    }

    System.out.println("Vetor 3");
    for (int i = 0; i < v3.length; i++) {
      System.out.print("V3[" + i + "] = ");
      v3[i] = in.nextInt();
    }

    System.out.println("Vetor Final");
    for (int i = 0; i < v_Resultante.length; i++) {
      int menor = v1[i];
      if (v2[i] < menor)
        menor = v2[i];

      if (v3[i] < menor)
        menor = v3[i];
      v_Resultante[i] = menor;
      System.out.println("V_Resultante[" + i + "] = " + v_Resultante[i]);
    }
  }
}

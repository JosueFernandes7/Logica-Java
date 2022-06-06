package Listas.Lista9;

import java.util.Scanner;

public class Ex08 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int soma_LinhaColuna = 0, soma_Diagonal1 = 0, soma_Diagonal2 = 0;
    int[][] MA = new int[3][3];

    System.out.println("Informe os elementos da matriz\n");
    for (int i = 0; i < MA.length; i++) {
      for (int j = 0; j < MA[i].length; j++) {
        System.out.print("MATRIZ[" + i + "][" + j + "] = ");
        MA[i][j] = in.nextInt();
      }
    }

    for (int i = 0; i < MA.length; i++) {
      for (int j = 0; j < MA.length; j++) {
        soma_LinhaColuna += MA[i][j];
        if (i == j)
          soma_Diagonal1 += MA[i][j];

        if (i + j == MA.length - 1) {
          soma_Diagonal2 += MA[i][j];
        }
      }
    }
    soma_LinhaColuna /= (MA.length);
    if (soma_LinhaColuna == soma_Diagonal1 && soma_Diagonal2 == soma_Diagonal1) {
      System.out.println("eh um quadrado magico");
    } else {
      System.out.println("nao eh um quadrado magico");
    }
  }
}

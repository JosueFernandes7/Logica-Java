package Listas.Lista9;

import java.util.Scanner;
import java.util.Random;

public class Ex09 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    boolean sair = true;
    // Y - LINHAS
    // X - COLUNA

    // Gerando posicao inicial aleatoria
    // Random aleat = new Random();
    // int x = aleat.nextInt(5);
    // int y = aleat.nextInt(5);
    int x = 5, y = 4;

    int[][] M = new int[10][10];
    // Mostro a tabela
    do {

      for (int linha = 0; linha < M.length; linha++) {
        for (int col = 0; col < M[linha].length; col++) {
          if (linha == y && col == x)
            M[y][x] = 5;

          System.out.print(M[linha][col] + "  ");
        }
        System.out.println();
      }
      System.out.print("Movimente o boneco: ");
      char move = in.next().toLowerCase().charAt(0);
      switch (move) {
        case 'w':
          if (y > 0) {
            M[y][x] = 0;
            y--;
            M[y][x] = 5;
          } else
            System.out.println("Movimento Invalido");
          break;

        case 's':
          if (y < M.length - 1) {
            M[y][x] = 0;
            y++;
            M[y][x] = 5;
          } else
            System.out.println("Movimento Invalido");
          break;

        case 'd':
          if (x < M.length - 1) {
            M[y][x] = 0;
            x++;
            M[y][x] = 5;
          } else
            System.out.println("Movimento Invalido");
          break;

        case 'a':
          if (x > 0) {
            M[y][x] = 0;
            x--;
            M[y][x] = 5;
          } else
            System.out.println("Movimento Invalido");
          break;

        case 'f':
          sair = false;
          break;
        default:
          break;

      }
    } while (sair);

  }
}
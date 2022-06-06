package Listas.Lista9;

import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[][] MA = new char[3][3];
    for (int i = 0; i < MA.length; i++) {
      for (int j = 0; j < MA.length; j++) {
        MA[i][j] = '-';
      }
    }
    boolean sair = false;
    int jogador = 0, contJogada = 0;
    char escolha;
    while (true) {

      for (int i = 0; i < MA.length; i++) {
        for (int j = 0; j < MA.length; j++) {
          System.out.print(MA[i][j] + "  ");
        }
        System.out.println();
      }
      if (sair)
        break;
      // 9 jogadas acaba o jogo
      if (contJogada == 9) {
        System.out.println("Deu Velha");
        break;
      }

      if (jogador == 0) {
        System.out.print("Jogador X: ");
        jogador = 1;
        escolha = 'X';
      } else {
        System.out.print("Jogador O: ");
        jogador = 0;
        escolha = 'O';
      }
      int casa = in.nextInt();
      int col = casa % 3;
      int lin = casa / 3;
      while (casa < 0 || casa >= 9 || MA[lin][col] != '-') {
        System.out.print("Casa Invalida Jogue em outra: ");
        casa = in.nextInt();

        col = casa % 3;
        lin = casa / 3;
      }
      MA[lin][col] = escolha;
      contJogada++;
      // Linha+Coluna+Diagonal+DiagonalSec
      for (int i = 0; i < MA.length; i++) {
        for (int j = 0; j < MA.length; j++) {
          // Linha
          if (j % 3 == 0 && MA[i][j] == MA[i][j + 1] && MA[i][j] == MA[i][j + 2] && MA[i][j] != '-') {
            System.out.println(escolha + " VENCEU!");
            sair = true;
            break;
          }
          // Coluna
          if (i % 3 == 0 && MA[i][j] == MA[i + 1][j] && MA[i][j] == MA[i + 2][j] && MA[i][j] != '-') {
            System.out.println(escolha + " VENCEU!");
            sair = true;
            break;
          }
          // Diagonal principal
          if (MA[0][0] == MA[1][1] && MA[0][0] == MA[2][2] && MA[1][1] != '-') {
            System.out.println(escolha + " VENCEU!");
            sair = true;
            break;
          }
          // Diagonal Secundaria
          if (MA[1][1] == MA[0][2] && MA[1][1] == MA[2][0] && MA[1][1] != '-') {
            System.out.println(escolha + " VENCEU!");
            sair = true;
            break;
          }
        }
        if (sair)
          break;
      }

    }
  }
}
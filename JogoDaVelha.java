import java.util.Scanner;

public class JogoDaVelha {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] posicao = new char[9];
    int pos;
    char XouB;
    posicao[0] = '-';
    posicao[1] = '-';
    posicao[2] = '-';
    posicao[3] = '-';
    posicao[4] = '-';
    posicao[5] = '-';
    posicao[6] = '-';
    posicao[7] = '-';
    posicao[8] = '-';
    int jogadas = 0;
    boolean sair = false;
    do {
      // ATUALIZAR O JOGO
      for (int i = 0; i < posicao.length; i++) {

        if (i == 2 || i == 5 || i == 8) {
          System.out.println(posicao[i]);
        } else {
          System.out.print(posicao[i] + " ");
        }
      }
      // SE FOREM JOGADAS 9 VEZES
      if (jogadas == 9) {
        System.out.println("Deu Velha");
        break;
      }

      if (sair)
        break;
      // verificar jogador e posicao
      if (jogadas % 2 == 0) {
        System.out.println("Jogador 1 Escolha uma posicao: ");
        pos = in.nextInt();
        posicao[pos] = 'X';
      } else {
        System.out.println("Jogador 2 Escolha uma posicao:");
        pos = in.nextInt();
        posicao[pos] = 'O';
      }
      // LINHAS
      for (int i = 0; i < posicao.length; i+=3) {
        if(i == 0 || i == 3 || i == 6) {
          if (posicao[i] == posicao[i + 1] && posicao[i + 2] == posicao[i] && posicao[i] != '-') {
            System.out.println("\n\n"+posicao[i] + " VENCEU!\n");
            sair = true;
            break;
          }
        }
      }
      // COLUNAS
      for (int i = 0; i < 3; i++) {
        if(posicao[i] == posicao[i + 3] && posicao[i] == posicao[i+6] && posicao[i] != '-'){
          System.out.println("\n\n"+posicao[i] + " VENCEU!\n");
          sair = true;
          break;
        }
      }
      // DIAGONAIS
      if(((posicao[0] == posicao[4] && posicao[4] == posicao[8]) || (posicao[2] == posicao[4] && posicao[6] == posicao[4])) && 
        posicao[4] != '-') {
        System.out.println("\n\n"+posicao[4] + " VENCEU!\n");
        sair = true;
      }

      jogadas++;
    } while (true);
  }
}

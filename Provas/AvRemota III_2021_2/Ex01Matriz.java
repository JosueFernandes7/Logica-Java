import java.util.Random;
import java.util.Scanner;

public class Ex01Matriz {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random aleat = new Random();
    int tam = in.nextInt();
    int[][] matriz = new int[tam][tam];
    int indice = 0;
    int repetiu = 0;
    do {

      int sorteado = aleat.nextInt(tam * tam);

      boolean repete = false;
      for (int i = 0; i < indice; i++) {
        if (matriz[i / tam][i % tam] == sorteado) {
          repete = true;
          repetiu++;
          break;
        }
      }

      if (!repete) {
        matriz[indice / tam][indice % tam] = sorteado;
        indice++;
      }

    } while (indice < tam * tam);
    System.out.println("Matriz " + tam + " x " + tam);
    for (

        int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        System.out.print(matriz[i][j] + "  ");
      }
      System.out.println();
    }
    System.out.println("Repetiu " + repetiu + " vezes");
  }
}
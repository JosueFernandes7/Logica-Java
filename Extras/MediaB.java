
// Forma 2
/*Objetivo fazer um vetor, onde a ultima coluna receba a media dos elementos da linha e recalcular a media com as medias anteriores
 * ex 1 2 3 media(123)
 *    4 5 6 (media(456)+media(123))/2
 */
import java.util.Scanner;

public class MediaB {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double[][] Notas = new double[3][4];
    for (int lin = 0; lin < Notas.length; lin++) {
      double media = 0;
      for (int col = 0; col < Notas[lin].length; col++) {

        // Se for ultima linha coloca a media que foi calculada
        if (col != Notas[lin].length - 1) {
          Notas[lin][col] = in.nextDouble();
          media += Notas[lin][col] / (Notas[lin].length - 1);
        } else if (lin != 0) {
          Notas[lin][col] = (media + Notas[lin - 1][col] * lin) / 2;
        } else {
          Notas[lin][col] = media;
        }
        // se a linha for maior que 0 verificar as anteriores

      }
    }
    for (int i = 0; i < Notas.length; i++) {
      for (int j = 0; j < Notas[i].length; j++) {
        System.out.print(Notas[i][j] + " ");
      }
      System.out.println();
    }
  }
}

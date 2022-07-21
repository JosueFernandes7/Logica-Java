import java.util.Scanner;
import java.util.Random;

public class Utils {

  // Preencher e Perguntar cada posicao
  public static void mostrarVetor(int[] vetor) {
    Scanner in = new Scanner(System.in);
    String mostrar = "{ ";
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Vetor[" + i + "] = ");
      vetor[i] = in.nextInt();
      if (i == vetor.length - 1) {
        mostrar += vetor[i] + " }";
        break;
      }
      mostrar += vetor[i] + ", ";
    }
    System.out.println(mostrar);
  }

  // Preencher vetor de forma automática
  public static void lotarVetor(int[] vetor,int num) {
    Random aleat = new Random();
    String mostrar = "{ ";
    for (int i = 0; i < vetor.length; i++) {
        vetor[i] = aleat.nextInt(num);
        if(i == vetor.length - 1) {
          mostrar += vetor[i] +" }";
          break;
        }
        mostrar+= vetor[i]+", ";
      }
      System.out.println(mostrar);
    }
  // Preencher Matriz Automática
  public static void lotarMatriz(int[][] matriz,int num) {
    Random aleat = new Random();
    String mostrar = "";
    for (int i = 0; i < matriz.length; i++) {
      for(int j = 0; j <matriz[i].length; j++) {
        matriz[i][j] = aleat.nextInt(num);
        mostrar += matriz[i][j]+"  ";
      }
    mostrar += "\n";
    }
    System.out.println(mostrar);
  }


}


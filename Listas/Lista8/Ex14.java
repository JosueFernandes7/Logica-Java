import java.util.Scanner;

public class Ex14 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int[] vetor = new int[10];
    int x, y, aux;
    for (int i = 0; i < vetor.length; i++) {

      System.out.print("vetor[" + i + "] = ");
      vetor[i] = in.nextInt();
    }
    do {

      System.out.print("POSICAO DO VETOR: ");
      x = in.nextInt();
      System.out.print("POSICAO DO VETOR: ");
      y = in.nextInt();
      if (x == -1 || y == -1)
        break;
      aux = vetor[x];
      vetor[x] = vetor[y];
      vetor[y] = aux;
      for (int i = 0; i < vetor.length; i++) {
        System.out.println("vetor[" + i + "] =" + vetor[i]);
      }

    } while (true);

  }
}

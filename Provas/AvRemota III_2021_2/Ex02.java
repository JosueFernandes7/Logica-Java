import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random aleat = new Random();
    int[] antigo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] novo;
    do {

      System.out.print("[");
      for (int i = 0; i < antigo.length; i++) {
        if (i == 0)
          System.out.print(antigo[i]);
        else
          System.out.print("," + antigo[i]);

      }
      System.out.println("]");
      novo = new int[antigo.length];

      int girar = in.nextInt();
      for (int i = 0; i < novo.length; i++) {
        if (i + girar < 0)
          novo[(i + girar + antigo.length) % antigo.length] = antigo[i];

        else
          novo[(i + girar) % antigo.length] = antigo[i];

      }

      antigo = novo;

    } while (true);
  }
}

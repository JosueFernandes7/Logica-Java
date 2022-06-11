import java.util.Scanner;
import java.util.Random;

public class Ex01Vetor {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Random aleat = new Random();
    int[] cartela = new int[5];
    for (int i = 0; i < cartela.length; i++) {
      cartela[i] = -1;
    }
    for (int pos = 0; pos < cartela.length; pos++) {
      cartela[pos] = aleat.nextInt(5);
      boolean repete = false;
      for (int i = 0; i < cartela.length; i++) {
        if (cartela[pos] == cartela[i] && pos != i) {
          repete = true;
          break;
        }
      }
      if (repete)
        pos--;
    }
    System.out.println("Cartela");
    for (int i = 0; i < cartela.length; i++) {
      System.out.print(cartela[i] + " ");
    }
  }
}

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];
    int soma=0;
    System.out.println("Preenchar o vetor");
    for (int i = 0; i < vetor1.length; i++) {
      vetor1[i] = in.nextInt();
      soma += vetor1[i];
      vetor2[i] = soma;
    }
    for (int i = 0; i < vetor2.length; i++) {
      System.out.println("v2["+i+"] = "+vetor2[i]);
    }

  }
}
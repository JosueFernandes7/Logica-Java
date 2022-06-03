import java.util.Scanner;

public class Ex03 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    float[] vetor = new float[10];
    float media = 0;
    System.out.println("Digite "+vetor.length+" valores");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = in.nextFloat();
      media += vetor[i]/vetor.length;
    }
    System.out.printf("Media  %.2f",media);

  }
}

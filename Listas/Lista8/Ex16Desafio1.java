import java.util.Scanner;

public class Ex16Desafio1 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int[] vetor1 = new int[5];
    int[] vetor2 = new int[5];
    int[] vetor_Final = new int[10];
    for (int i = 0; i < vetor1.length; i++) {
      System.out.print("vetor1[" + i + "] = ");
      vetor1[i] = in.nextInt();
      vetor_Final[i] = vetor1[i];
    }
    for (int i = 0; i < vetor2.length; i++) {
      System.out.print("vetor2[" + i + "] = ");
      vetor2[i] = in.nextInt();
      vetor_Final[i+5] = vetor2[i];
    }

    // Bubble sort
    for (int i = 0; i < vetor_Final.length; i++) {
      for(int j = i+1; j < vetor_Final.length; j++) {
        if(vetor_Final[i] > vetor_Final[j]) {
          int aux = vetor_Final[j];
          vetor_Final[j] = vetor_Final[i];
          vetor_Final[i] = aux;
        }
      }
      System.out.println("Vetor Final Ordenado[" + i + "] = "+vetor_Final[i]);
    }
    
  }
}

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.print("Tamanho dos vetores: ");
    int tamanho = in.nextInt();
    int[] v1 = new int[tamanho];
    int[] v2 = new int[tamanho];
    int[] soma = new int[tamanho];
    for (int i = 0; i < soma.length; i++) {
      System.out.print("\nVetor 1["+i+"] = ");
      v1[i] = in.nextInt();
      System.out.print("Vetor 2["+i+"] = ");
      v2[i] = in.nextInt();
      soma[i] = v1[i] + v2[i];
    }
    System.out.println("\nVETOR SOMA\n===============");
    for (int i = 0; i < soma.length; i++) {
      System.out.println("SOMA["+i+"] = "+soma[i]);
    }
    
  }
}

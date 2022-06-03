import java.util.Scanner;

public class Ex13 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int[] vetor = new int[12];
    int x,y,soma=0;
    for (int i = 0; i < vetor.length; i++) {
      
      System.out.print("vetor["+i+"] = ");
      vetor[i] = in.nextInt();
    }
    do {
      
      System.out.print("POSICAO DO VETOR: ");
      x = in.nextInt();
      System.out.print("POSICAO DO VETOR: ");
      y = in.nextInt();
      if(x==-1 || y==-1) break;

      soma = vetor[x] + vetor[y];
      System.out.println("SOMA = " + soma);
    } while(true);
      
    
  }
}

import java.util.Scanner;
// método simplificado
public class Ex07 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int[] votos = new int[5];
    int escolha;
    do {
      System.out.print("Candidado Escolhido: ");
      escolha = in.nextInt();
      if(escolha >0 && escolha <=5) votos[escolha-1] += 1;
    } while(escolha!=-1);
    for (int i = 0; i < votos.length; i++) {
      System.out.println("Candidato "+(i+1)+" = "+votos[i]+" voto(s)");
    }
  }
}

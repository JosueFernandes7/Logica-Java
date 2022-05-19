// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Dio {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    int respostasCompetidores = 5;
    int[] respostas = new int[respostasCompetidores];
    int acerto =0;
    for (int i = 0; i < respostas.length; i++) {
      respostas[i] = in.nextInt();
      if(respostas[i] == t) acerto++;
    }
//TODO: Complete o código com uma possível solução para o problema.    
     
    
    System.out.println(acerto);
  }
}
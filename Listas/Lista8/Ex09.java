import java.util.Random;
import java.util.Scanner;
// método simplificado
public class Ex09 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    Random aleat = new Random();
    int[] gabarito = new int[5];  
    
    // Para ver o gabarito é só ativar a l13
    for (int i = 0; i < gabarito.length; i++) {
      gabarito[i] = aleat.nextInt(11);
      // System.out.print(gabarito[i]+" ");
    }
    System.out.println("");
    int acerto =0;
    System.out.print("Tentativas: ");
    do {
      int tentativa = in.nextInt();
      
      for(int i =0; i<gabarito.length; i++) {
        if(tentativa == -1) break;
        if(gabarito[i] == tentativa){
          gabarito[i] = -1;
          acerto++;
          break;
          // se tive 2 iguais para nao preenchar duas vezes break.
        }
      }
      System.out.println(acerto+" acerto(s)");
    } while(acerto!=5);
    System.out.println("Parabens voce acertou tudo!");
  }
}

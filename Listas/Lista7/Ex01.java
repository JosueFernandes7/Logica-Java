import java.util.Scanner;
// QUESTÃO 1 = QUESTÃO 3  
public class Ex01 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.println("Qual o dia da semana:");
    int dia = in.nextInt();

    switch (dia) {
      case 1, 7:
        System.out.println("Fim de semana");
        break;

      case 2, 3, 4, 5, 6:
        System.out.println("Dia util");
        break;
        
      default:
        System.out.println("Dia invalido!");
    }
  }
}

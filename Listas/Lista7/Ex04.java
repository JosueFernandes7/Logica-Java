import java.util.Scanner;

public class Ex04 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int valor = 100;
    System.out.println("[1] Crianca menor que 10 R$ 80");
    System.out.println("[2] Conveniados entre 10 e 30 R$ 50");
    System.out.println("[3] conveniados com idade entre 40 e 60 anos R$ 95");
    System.out.println("[4] conveniados com mais de 60 R$ 130");
    int selection = in.nextInt();
    switch (selection) {
      case 1:
        valor = 180;
        break;
      case 2:
        valor = 150;
        break;
      case 3:
        valor = 195;
        break;
      case 4:
        valor = 230;
        break;
      default:
        System.out.println("Numero invalido");
    }
    System.out.println("Valor a pagar "+valor+" R$");
  }
}

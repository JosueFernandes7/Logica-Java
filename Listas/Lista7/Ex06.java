import java.util.Scanner;

public class Ex06 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.println("[M] - Masculino\n[F] - Feminino");
    char  sexo = in.next().toUpperCase().charAt(0);
    switch (sexo) {
      case 'M':
        System.out.println("Sexo Masculino");
        break;
      case 'F':
        System.out.println("Sexo Feminino");
        break;
      default:
        System.out.println("Sexo Invalido!");
    }

    
  }
}

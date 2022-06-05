package Listas.Lista7;
import java.util.Scanner;

public class Ex02 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.println("Ano: ");
    int ano = in.nextInt();
    boolean bissexto = (ano % 4 == 0);
    System.out.println("Mes:"); 
    int mes = in.nextInt();

    switch (mes) {
      case 1,3,5,7,8,10,12:
        System.out.println("31 dias");
        break;
      case 4,6,9,11:
        System.out.println("30 dias");
        break;
      case 2:
        if(bissexto == true) System.out.println("29 dias");
        else System.out.println("28 dias");
        break;
      default:
        System.out.println("mes invalido");

    }
  }
}

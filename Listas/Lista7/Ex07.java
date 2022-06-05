package Listas.Lista7;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.println("Em que turno você estuda");
    System.out.println("M-Matutino ou V-Vespertino ou N- Noturno");
    char turno = in.next().toUpperCase().charAt(0);
    switch (turno) {
      case 'M':
        System.out.println("Bom Dia!");
        break;
      case 'V':
        System.out.println("Boa Tarde!");
        break;
      case 'N':
        System.out.println("Boa Noite!");
        break;
      default:
        System.out.println("Valor invalido!");
    }
  }
}

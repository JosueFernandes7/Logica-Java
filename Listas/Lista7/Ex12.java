package Listas.Lista7;

import java.util.Scanner;

public class Ex12 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.print("Valor da compra: ");
    float compra = in.nextFloat();
    System.out.println("[1] cliente\n[2] funcionario\n[3] vip");
    int codigo = in.nextInt();

    switch (codigo) {
      case 3:
        compra -= compra * 5 / 100f;
        break;
      case 2:
        compra -= compra * 10 / 100f;
        break;
      default:
    }
    System.out.printf("Valor a ser pago R$ %.2f", compra);
  }
}

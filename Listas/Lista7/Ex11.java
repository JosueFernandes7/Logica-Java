package Listas.Lista7;

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    float result = 0;
    boolean mostrar = true;

    System.out.print("Valor 1: ");
    float valor1 = in.nextFloat();

    System.out.print("Valor 2: ");
    float valor2 = in.nextFloat();

    // System.out.print("\033\143"); Limpa Tela
    System.out.println("[1] Soma\n[2] Subtracao\n[3] Divisao\n[4] Multiplicacao");
    int operacao = in.nextInt();

    switch (operacao) {
      case 1:
        result = valor1 + valor2;
        break;
      case 2:
        result = valor1 - valor2;
        break;
      case 3:
        result = valor1 / valor2;
        break;
      case 4:
        result = valor1 * valor2;
        break;
      default:
        mostrar = false;
        System.out.println("Operacao Invalida!");
    }
    if (mostrar)
      System.out.printf("Resultado = %.2f", result);
  }
}

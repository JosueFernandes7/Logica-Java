package Listas.Lista7;

import java.util.Scanner;

public class Ex09 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.print("Mes: ");
    String mes = in.next().toUpperCase();
    switch (mes) {
      case "DEZEMBRO", "FEVEREIRO", "JUNHO", "JULHO":
        System.out.println("Mes de Alta Temporada!");
        break;
      case "JANEIRO", "MARCO", "ABRIL", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO":
        System.out.println("Mes de Baixa Temporada!");
        break;
      default:
        System.out.println("Mes Invalido!");
    }
  }
}

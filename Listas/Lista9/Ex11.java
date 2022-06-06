package Listas.Lista9;

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] Meses = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
        "Outubro", "Novembro", "Dezembro" };

    double[][] Semanas = new double[12][4];
    double[] mes = new double[12];
    double ano = 0;
    for (int i = 0; i < Semanas.length; i++) {
      System.out.println("Vendas em " + Meses[i]);
      for (int j = 0; j < Semanas[i].length; j++) {
        System.out.print("Semana " + (j + 1) + ": ");
        Semanas[i][j] = in.nextDouble();
        mes[i] += Semanas[i][j];
      }
      ano += mes[i];
    }

    for (int i = 0; i < Semanas.length; i++) {
      System.out.println("Total vendido no mes de " + Meses[i] + " = " + mes[i]);
      for (int j = 0; j < Semanas[i].length; j++) {
        System.out.println("Semana " + (j + 1) + " = " + Semanas[i][j]);
      }
    }
    System.out.println("Total no ano = " + ano);
  }
}
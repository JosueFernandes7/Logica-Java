package Listas.Lista8;

import java.util.Scanner;

// método simplificado
public class Ex15 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int[] vetor = new int[20];
    String mostrar = "";
    Boolean encontrado = false;

    for (int i = 0; i < vetor.length; i++) {
      System.out.print("vetor[" + i + "] = ");
      vetor[i] = in.nextInt();
    }
    System.out.print("Escolha um numero: ");
    int x = in.nextInt();
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == x) {
        encontrado = true;
        mostrar += x + " Foi encontrado na posicao " + i + "\n";
      }
    }
    if (encontrado) {
      System.out.print(mostrar);
    } else {
      System.out.println(x + " Nao foi encontrado no vetor");
    }
  }
}
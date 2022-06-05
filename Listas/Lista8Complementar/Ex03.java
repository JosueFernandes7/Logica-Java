package Listas.Lista8Complementar;

import java.util.Scanner;

// equalIgnoreCase ignora se tem maiscula ou minuscula
public class Ex03 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] lista_Nomes = new String[4];
    String nome;

    System.out.println("Lista de Nomes");
    for (int i = 0; i < lista_Nomes.length; i++) {
      lista_Nomes[i] = in.next();
    }

    do {
      System.out.println("Digite seu nome: ");
      nome = in.next();
      if (nome.equalsIgnoreCase("fim"))
        break;
      String mostrar = "NAO ACHEI";
      for (int i = 0; i < lista_Nomes.length; i++) {
        if (nome.equalsIgnoreCase(lista_Nomes[i])) {
          mostrar = "ACHEI";
          break;
        }
      }
      System.out.println(mostrar);

    } while (true);

  }
}
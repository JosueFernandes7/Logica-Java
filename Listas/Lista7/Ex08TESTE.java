package Listas.Lista7;

import java.util.Scanner;

public class Ex08TESTE {
  public static void main(String[] agrs) {
    boolean valido = false;
    Scanner in = new Scanner(System.in);
    int digito1 = 0, digito2 = 0, soma1 = 0, soma2 = 0;
    int contador = 10, contPonto = 1;
    String numero = in.next();
    String numeronovo = "";
    for (int i = 0; i < numero.length() - 2; i++) {
      char digito = numero.charAt(i);
      if (contPonto % 3 == 0 && contPonto != 9) {
        numeronovo += digito + ".";
      } else {
        numeronovo += digito + "";
      }
      contPonto++;
      int number = Integer.parseInt(String.valueOf(digito));
      soma1 += number * contador;
      contador--;
    }
    digito1 = 11 - (soma1 % 11);
    contador = 11;
    for (int i = 0; i < numero.length() - 2; i++) {
      char digito = numero.charAt(i);
      int number = Integer.parseInt(String.valueOf(digito));
      soma2 += number * contador;
      contador--;
    }
    soma2 += digito1 * 2;
    digito2 = 11 - (soma2 % 11);

    if (digito1 < 10 && (digito1 == Integer.parseInt(String.valueOf(numero.charAt(9))) || digito1 == 0)) {
      valido = true;
    }
    if (digito2 < 10 && (digito2 == Integer.parseInt(String.valueOf(numero.charAt(9))) || digito2 == 0)) {
      valido = true;
    }

    if (valido == true)
      System.out.println(numero + "e um cpf valido");
    else {
      numeronovo += "-" + digito1 + "" + digito2;
      System.out.println(numero + " nao e valido! Para ser valido, deveria ser " + numeronovo);
    }
  }
}

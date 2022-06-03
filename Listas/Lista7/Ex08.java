import java.util.Scanner;

public class Ex08 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    // Número tem 11 digitos portanto podemos retirar o ultimo e o penultimo
    // dividindo por 10 duas vezes e pegar o resto 11 - 2 = 9 digitos uteis
    System.out.print("CPF: ");
    long cpf = in.nextLong();
    long ultimo = 0, penultimo = 0;
    // Retira os dois últimos termos
    for (int i = 0; i < 2; i++) {
      if (i == 1)
        penultimo = cpf % 10;
      if (i == 0)
        ultimo = cpf % 10;
      cpf = cpf / 10;
    }
    // verificação penultimo digito
    long cpf1 = cpf;
    int novoPenultimo = 0, novoUltimo = 0;
    int soma1 = 0, soma2 = 0;
    for (int i = 0, cont = 2; i < 9 && cont < 11; i++, cont++) {
      soma1 += (cpf1 % 10) * cont;
      cpf1 = cpf1 / 10;
    }
    novoPenultimo = 11 - (soma1 % 11);
    // verificação ultimo digito
    cpf1 = cpf;
    for (int i = 0, cont = 3; i < 9 && cont <= 11; i++, cont++) {
      soma2 += (cpf1 % 10) * cont;
      cpf1 = cpf1 / 10;
    }
    soma2 += novoPenultimo * 2;
    novoUltimo = 11 - (soma2 % 11);
    // verificar se o cpf é valido
    boolean valido = false;
    if ((novoPenultimo < 10) && (novoPenultimo == penultimo || novoPenultimo == 0)) {
      valido = true;
    }
    if ((novoUltimo < 10) && (novoUltimo == ultimo || novoUltimo == 0)) {
      valido = true;
    }
    // imprimir na tela
    if (valido) {
      System.out.println(cpf + " eh valido");
    } else {

      cpf = cpf*100 + novoPenultimo*10 + novoUltimo;

      System.out.println(cpf + " nao e valido! Para ser valido, deveria ser " + cpf);
    }
  }
}

import java.util.Scanner;
public class Ex02{

  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    int num = in.nextInt();
    int i = 1;
    int soma = 0;
    while(i <= num) {
      soma += i;
      i++;
    }
    System.out.println("Soma dos "+num+" primeiros inteiros positivos = "+soma);
  }
}
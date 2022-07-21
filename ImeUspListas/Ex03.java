import java.util.Scanner;
public class Ex03{

  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    int num = in.nextInt();
    int contImpar = 0;
    int contador = 1;
    while(contImpar != num) {
      if(contador %2 !=0) {
        System.out.println(contador);
        contImpar++;
      }
      contador++;
    }
  }
}
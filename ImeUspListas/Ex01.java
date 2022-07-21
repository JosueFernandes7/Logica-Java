import java.util.Scanner;
public class Ex01{

  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int num;
    do{
      System.out.print("Digite um Numero: ");
      num = in.nextInt();
      if(num == 0) break;
      int quadrado = num*num;
      System.out.println(num+" ao quadrado = "+quadrado);
    } while(true);
    System.out.println("Saindo.....");
  }
}
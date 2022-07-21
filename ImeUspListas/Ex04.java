import java.util.Scanner;
public class Ex04{

  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.print("Digite a base (numero inteiro): ");
    int num = in.nextInt();
    System.out.print("Digite o expoente (inteiro >= 0) ");
    int exp = in.nextInt();
    int i = exp;
    int resultado = 1;
    while(i!=0) { 
      resultado *= num; 
      i--;
    }
    System.out.print("O valor de "+num+" elevado a "+exp+" eh "+resultado);
  }
}
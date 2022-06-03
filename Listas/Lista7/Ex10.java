import java.util.Scanner;

public class Ex10 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.println("Preco: ");
    float preco = in.nextFloat();
    System.out.println("Codigo do items: ");
    int margem = in.nextInt();
    boolean marg = true;
    switch(margem) {
      case 1,2:
        preco *= 80/100f;
        break;
      case 3,4:
        break;
      case 5,6:
        preco *= 90/100f;
        break;
      default:
        marg = false;
        System.out.println("Margem Invalida!");
    }
    
    if(marg)  System.out.printf("Preco total = %.2f",preco);

  }
}

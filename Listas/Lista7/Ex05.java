import java.util.Scanner;

public class Ex05 {
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    System.out.println("Valor da multa:");
    float mult = in.nextFloat();
    System.out.println("Atraso em meses");
    float atraso = in.nextFloat();
    float taxa = 0.05f;
    do {
      mult += mult*taxa;
      atraso--;
    } while(atraso !=0);
    System.out.printf("R$ %.2f",mult);
  }
}

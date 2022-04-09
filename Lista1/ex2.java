// FEITO
import java.util.Scanner;
public class ex2{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float number = in.nextFloat();
        number *= 1.2;
        System.out.printf("Valor reajustado em 20%%: %.2f\n", number);

    }
}
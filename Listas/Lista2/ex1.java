// FEITO
import java.util.Scanner;
public class ex1{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Numero em metros: ");
        float num = in.nextFloat();
        num *=100;
        System.out.printf("Conversao %.2f cm",num);
        

    }
}
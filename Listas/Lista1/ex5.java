// FEITO
import java.util.Scanner;
public class ex5{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Temperatura em  Fahrenheit: ");
        double fah,celsius;
        fah = in.nextDouble();
        celsius = ((fah-32)*5)/9;
        System.out.printf("Temperatura em Celsius: %.2f",celsius);
    }
}
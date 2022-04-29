// FEITO
import java.util.Scanner;
public class ex4{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float base,altura,area;
        System.out.print("Base do Triangulo: ");
        base = in.nextFloat();

        System.out.print("Altura do Triangulo: ");
        altura = in.nextFloat();

        area = (base * altura)/2;
        System.out.printf("Area do Triangulo: %.2f",area,"cm²");
    }
}
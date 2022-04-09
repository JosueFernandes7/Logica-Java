// FEITO
import java.util.Scanner;
public class ex3{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = in.nextInt();
        if(num>=0){
            System.out.println("Positivo");
        }
        else{
            System.out.println("Negativo");
        }
        

    }
}

import java.util.Scanner;
public class Ex2{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite Tres numeros: ");
        int num1,num2,num3,maior;
        num1=in.nextInt();
        num2=in.nextInt();
        num3=in.nextInt();
        maior = num1;
        if(num2 >maior){
            maior=num2;
        }
        if(num3>maior) {
            maior = num3;
        }
        System.out.println("maior = "+maior);
    }
}

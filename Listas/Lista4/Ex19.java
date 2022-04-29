import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fibo = "";
        int num1, num2, num3=0,i = 2, desejado;
        System.out.print("Quantos termos vc deseja: ");
        desejado = in.nextInt();
        num1 = 1;
        num2 = 1;

        if (desejado == 1) {
            fibo += num1;
        } else if (desejado == 2) {
            fibo += num1+" "+num2;
        } else {
            fibo += num1+" "+num2;
            while ( i < desejado) {
                num3 = num1+num2;
                
                fibo += " "+num3;
                num1 = num2;
                num2 = num3;
                i++;
            }

        }
        System.out.println(fibo);
    }
}

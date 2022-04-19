

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Seu salario: ");
        double salario = in.nextDouble();
        double taxa=0;
        String texto = "";
        if(salario <=2000){
            System.out.println("Isento");
        } else if(salario <=3000) {
            salario = salario-2000;
            taxa = salario*8/100;
        } else if(salario <=4500){
            salario = salario - 3000;
            taxa = 80 + salario*18/100;
        } else {
            salario = salario - 4500;
            taxa = 80 + 270 + salario*28/100;
        }
        if(taxa != 0 ) {
            System.out.printf("Taxa de %.0f R$",taxa);
        }
    }
}

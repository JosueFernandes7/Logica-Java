package Extras.P2;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe tres valores: ");
        int num1=in.nextInt(),num2=in.nextInt(),divisor=in.nextInt();
        int maior=num1,menor=num2,soma=0;
        if(num2 > maior){
            maior = num2;
            menor = num1;
        }

        while(maior > menor){

            if(maior%divisor == 0){
                soma = soma + maior;
            }

            maior--;
        }
        System.out.println("Resultado: "+soma);
    }
}

package Extras.P2;


import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um valor inicial: ");
        int numero = in.nextInt();
        int anterior = numero;

        while(numero!=0){
            System.out.print("Informe outro valor:");
            numero = in.nextInt();
            if(numero != 0) {
                if(numero % anterior == 0 ){
                    System.out.println(numero+" e multiplo de: "+anterior);
                } else if(anterior % numero == 0) {
                    System.out.println(numero+" e divisor de: "+anterior);
                } else {
                    System.out.println(numero+" nao e nada de: "+anterior);
                }
                anterior = numero;
            }
        }
    }
}

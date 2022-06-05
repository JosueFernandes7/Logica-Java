// FEITO
package Listas.Lista2;

import java.util.Scanner;
public class ex17{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Custo de fabrica do Carro: ");
        float carro = in.nextFloat();
        float valor =(float)(carro+carro*0.28+carro*0.45);
        float valor2 =(float)(carro*1.28*1.45);
        System.out.printf("Valor do ao Consumido %.2f R$\n",valor);

    }
}
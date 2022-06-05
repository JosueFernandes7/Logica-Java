// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero de carros vendidos: ");
        float nCarros = in.nextFloat();

        System.out.print("Valor por carro: ");
        float carro = in.nextFloat();

        System.out.print("Salario fixo: ");
        float salarioFix = in.nextFloat();

        System.out.print("Valor total Vendas: ");
        float vTot = in.nextFloat();

        float salario = (float) (nCarros * carro + salarioFix + vTot * 1.05);

        System.out.printf("Salario = R$ %.2f", salario);

    }
}
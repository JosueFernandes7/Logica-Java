// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float hTrab, salHor, imposto, salario;
        System.out.print("Salario por hora: ");
        salHor = in.nextFloat();
        System.out.print("Hora Trabalhadas no mes: ");
        hTrab = in.nextFloat();
        System.out.print("Imposto sobre o salario em %: ");
        imposto = in.nextFloat();

        salario = salHor * hTrab * (100 - imposto) / 100;

        System.out.printf("\n\tSalario Liquido mes: %.2f R$\n", salario);
        System.out.printf("\tSalario Liquido Ano: %.2f R$\n", salario * 12);

    }
}
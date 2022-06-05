// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Base: ");
        float base = in.nextFloat();
        System.out.print("Altura: ");
        float altura = in.nextFloat();
        float perimetro, area;
        area = base * altura;
        perimetro = 2 * base + 2 * altura;

        System.out.printf("Area = %.2f Perimetro = %.2f", area, perimetro);

    }
}
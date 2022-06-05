// FEITO
package Listas.Lista1;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b, c;
        System.out.print("PARAMETRO a:");
        a = in.nextFloat();

        System.out.print("PARAMETRO b:");
        b = in.nextFloat();

        System.out.print("PARAMETRO c:");
        c = in.nextFloat();

        float delta, x1, x2, raizq;
        delta = (float) Math.pow(b, 2) - (4 * a * c);

        raizq = (float) Math.sqrt(delta);// math pow ou math sqrt converte para double
        x1 = (-b + raizq) / (2 * a);
        x2 = (-b + raizq * -1) / (2 * a);

        System.out.printf("\nX1 = %.4f\n", x1);
        System.out.printf("X2 = %.4f", x2);

    }
}
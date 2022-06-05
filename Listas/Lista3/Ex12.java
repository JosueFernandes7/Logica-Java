package Listas.Lista3;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        int lados, perimetro = 0;
        float medida, area = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Numero de lados do poligono: ");
        lados = in.nextInt();
        System.out.print("Medida do lado em Cm: ");
        medida = in.nextFloat();
        if (lados < 3) {
            System.out.println("NAO E UM POLIGONO");
        } else if (lados == 3) {
            perimetro = lados * 3;
            System.out.println("TRIANGULO DE PERIMETRO = " + perimetro);
        } else if (lados == 4) {
            area = medida * medida;
            System.out.printf("QUADRADO DE AREA = %.2f cm2", area);
        } else if (lados == 5) {
            System.out.println("PENTAGONO");
        } else {
            System.out.println("POLIGONO NAO IDENTIFICADO");
        }
    }
}

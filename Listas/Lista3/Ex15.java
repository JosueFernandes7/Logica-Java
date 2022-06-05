package Listas.Lista3;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite os tres lados do triangulo respectivamente: ");
        float l1, l2, l3;
        l1 = in.nextFloat();
        l2 = in.nextFloat();
        l3 = in.nextFloat();
        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
            if (l1 == l2 && l2 == l3) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("TRIANGULO ISOSCELES");
            } else {
                System.out.println("TRIANGULO ESCALENO");
            }

        } else {
            System.out.println("NAO FORMA TRIANGULO");
        }
    }
}

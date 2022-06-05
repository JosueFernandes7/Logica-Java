// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Comprimento cozinha: ");
        float comprimento = in.nextFloat();

        System.out.print("Largura cozinha: ");
        float largura = in.nextFloat();

        System.out.print("Altura cozinha: ");
        float altura = in.nextFloat();

        float CxL = comprimento * largura;
        float CxA = comprimento * altura * 2;
        float LxA = largura * altura * 2;
        int azulejos = (int) ((CxL + CxA + LxA) / 1.5);
        System.out.print("Serao necessarios " + azulejos + " azulejos");

    }
}
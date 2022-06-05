// FEITO
package Listas.Lista2;

import java.util.Scanner;

public class ex24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Idade Homem 1: ");
        int h1 = in.nextInt();

        System.out.print("Idade Homem 2: ");
        int h2 = in.nextInt();

        System.out.print("Idade Mulher 1: ");
        int m1 = in.nextInt();

        System.out.print("Idade Mulher 2: ");
        int m2 = in.nextInt();

        int mVelha, mNova, hVelho, hNovo;
        if (m2 > m1) {
            mVelha = m2;
            mNova = m1;
        } else {
            mVelha = m1;
            mNova = m2;
        }
        if (h2 > h1) {
            hVelho = h2;
            hNovo = h1;
        } else {
            hVelho = h1;
            hNovo = h2;
        }
        System.out.println("\tHomem mais velho " + hVelho);
        System.out.println("\tHomem mais novo " + hNovo);
        System.out.println("\tMulher mais velha " + mVelha);
        System.out.println("\tMulher mais nova " + mNova);

    }
}
// FEITO
package Listas.Lista1;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite sua nota: ");
        float nota = in.nextFloat();
        if (nota < 7) {
            System.out.println("VOCE ESTA EM RECUPERACAO");
        } else {
            System.out.println("VOCE ESTA APROVADO");
        }
    }
}
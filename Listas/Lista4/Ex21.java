package Listas.Lista4;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, maiorPar = 0, menorImp = 0;
        int contpar = 0, contimpar = 0;
        float mediaPar = 0, mediaImp = 0;

        while (num >= 0) {

            System.out.print("Digite um numero: ");
            num = in.nextInt();
            if (num >= 0) {

                if (num % 2 == 0) {
                    if (contpar == 0) {
                        maiorPar = num;
                    } else if (num > maiorPar) {
                        maiorPar = num;
                    }
                    mediaPar = mediaPar + num;
                    contpar++;
                } else {
                    if (contimpar == 0) {
                        menorImp = num;
                    } else if (num < menorImp) {
                        menorImp = num;
                    }
                    mediaImp = mediaImp + num;
                    contimpar++;
                }
            }
        }
        if (contimpar == 0) {
            contimpar = 1;
        }
        if (contpar == 0) {
            contpar = 1;
        }
        mediaPar = mediaPar / contpar;
        mediaImp = mediaImp / contimpar;
        System.out.printf("MEDIA PAR = %.2f\n", mediaPar);
        System.out.printf("MEDIA IMPAR = %.2f\n", mediaImp);
        System.out.println("MAIOR PAR = " + maiorPar);
        System.out.println("MENOR IMPAR = " + menorImp);
    }
}

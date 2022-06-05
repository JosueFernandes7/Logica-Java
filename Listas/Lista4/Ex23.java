package Listas.Lista4;

import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("MASSA DE MATERIAL EM g: ");
        double massa = in.nextDouble();
        int tempo = 0;
        while (massa >= 0.1) {
            tempo = tempo + 30;
            massa = massa * 0.75;
        }

        System.out.println("FORAM GASTOS " + tempo / 3600 + " Hora(s)");
        tempo = tempo % 3600;
        System.out.println("FORAM GASTOS " + tempo / 60 + " Minuto(s)");
        System.out.println("FORAM GASTOS " + tempo % 60 + " Segundo(s)");
    }
}
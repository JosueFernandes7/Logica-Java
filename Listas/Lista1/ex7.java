// FEITO
package Listas.Lista1;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float dist, vel, tempo;
        System.out.print("Distancia a ser percorrida em km: ");
        dist = in.nextFloat();
        System.out.print("Velocidade do carro em km/h: ");
        vel = in.nextFloat();
        tempo = dist / vel * 60;
        System.out.printf("%.0f minutos para chegar ao seu destino%n", tempo);
    }
}
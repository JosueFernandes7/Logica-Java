package Listas.Lista3;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1, t2;
        System.out.println("Gols time 1");
        t1 = in.nextInt();
        System.out.println("Gols time 2");
        t2 = in.nextInt();
        if (t1 == t1) {
            System.out.println("EMPATE");
        } else if (t1 > t2) {
            System.out.println("Time 1 VENCEDOR");
        } else {
            System.out.println("Time 2 VENCEDOR");
        }

    }
}
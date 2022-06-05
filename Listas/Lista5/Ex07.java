package Listas.Lista5;

import java.io.IOException;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }

}
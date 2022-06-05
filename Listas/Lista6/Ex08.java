package Listas.Lista6;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anterior = in.nextInt();
        do {
            int number = in.nextInt();
            if (number > 2 * anterior)
                break;

            anterior = number;
        } while (true);
    }
}

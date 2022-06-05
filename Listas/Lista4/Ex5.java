package Listas.Lista4;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        float nota, media = 0;
        while (i <= 5) {
            System.out.print("Aluno " + i + " nota: ");
            nota = in.nextFloat();
            media = media + nota;
            i++;
        }
        media = media / (i - 1);
        System.out.printf("MEDIA = %.2f\n", media);
    }
}

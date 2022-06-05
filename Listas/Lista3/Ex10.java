package Listas.Lista3;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual seu sexo\n[1] Feminino\n[2] Masculino");
        int sexo = in.nextInt();
        System.out.print("Sua altura em cm: ");
        float altura = in.nextFloat() / 100;
        float peso = 0;
        if (sexo == 1) {
            peso = ((62.1f * altura) - 58);
        }
        if (sexo == 2) {
            peso = ((72.7f * altura) - 44.7f);
        }
        System.out.printf("Seu peso ideal = %.2f", peso);

    }
}
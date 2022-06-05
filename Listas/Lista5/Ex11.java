package Listas.Lista5;

import java.io.IOException;
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int senha = 2002;
        int tentativa = in.nextInt();
        while (senha != tentativa) {
            System.out.println("Senha Invalida");
            tentativa = in.nextInt();
        }
        System.out.println("Acesso Permitido");

    }

}
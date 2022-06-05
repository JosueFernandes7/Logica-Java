package Listas.Lista6;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int milhar, centena, dezena, unidade;
        int numero, soma;
        for (milhar = 1; milhar <= 9; milhar++) {
            for (centena = 0; centena <= 9; centena++) {
                for (dezena = 0; dezena <= 9; dezena++) {
                    for (unidade = 0; unidade <= 9; unidade++) {
                        soma = milhar * 10 + centena + dezena * 10 + unidade;
                        numero = milhar * 1000 + centena * 100 + dezena * 10 + unidade;
                        if (soma * soma == numero) {
                            System.out.println(numero);
                        }
                    }
                }
            }
        }
    }
}

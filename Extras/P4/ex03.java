package Extras.P4;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double maior = 0, menor = 0;
        String resultado = "";
        String pontMaior = "";
        double nota = 0, soma = 0, notaMaior = 0;
        String nome = "";
        int j = 1;
        while (!nome.equals("FIM")) {
            soma = 0;
            System.out.print("Nome do atleta: ");
            nome = in.next().toUpperCase();
            if (!nome.equals("FIM")) {
                System.out.print("Nota 1: ");
                nota = in.nextDouble();
                maior = nota;
                menor = nota;
                soma += nota;
                int i = 2;
                while (i <= 7) {
                    System.out.print("Nota " + i + ": ");
                    nota = in.nextDouble();
                    soma += nota;
                    if (nota > maior) {
                        maior = nota;
                    }
                    if (nota < menor) {
                        menor = nota;
                    }
                    i++;
                }
                soma = soma - maior - menor;
                if (j == 1) {
                    notaMaior = soma;
                    pontMaior = "Maior pontuacao "+nome+" "+soma+" pts";
                    j++;
                }
                if (soma > notaMaior) {
                    notaMaior = soma;
                    pontMaior = "Maior pontuacao "+nome+" "+soma+" pts";
                }
                resultado += nome + " = " + soma + "\n";
            }
        }
        System.out.print(resultado);
        System.out.println(pontMaior);
    }
}

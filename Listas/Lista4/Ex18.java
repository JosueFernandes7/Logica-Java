package Listas.Lista4;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // criar um while que só saia quando digitado 0
        // escaner a idade em cada while criar 1 var idade
        // criar 4 variaveis numpessoas,media,menor,maior
        int idade = -1, maior = 0, menor = 0, pessoas = 0;
        float media = 0;

        System.out.print("Digite sua idade: ");
        idade = in.nextInt();
        // guardar a primeira idade nas variaveis
        if (idade != 0) {
            media = media + idade;
            maior = idade;
            menor = idade;
            pessoas = pessoas + 1;
        }
        while (idade != 0) {

            System.out.print("Digite sua idade: ");
            idade = in.nextInt();

            if (idade != 0) {
                media = media + idade;
                pessoas = pessoas + 1;

                if (idade > maior) {
                    maior = idade;
                }

                if (idade < menor) {
                    menor = idade;
                }
            }
        }
        media = media / pessoas;
        System.out.println("Existem " + pessoas + " pessoas");
        System.out.printf("Idade media do grupo = %.2f\n", media);
        System.out.println("Menor idade = " + menor + "\nMaior idade = " + maior);
    }
}
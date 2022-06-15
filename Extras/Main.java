/* Faça um programa que calcule o desvio padrão de um vetor v contendo n
números, onde m, na fórmula abaixo é a média aritmética do vetor e os valores do
vetor, bem como seu tamanho são definidos pelo usuário. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanhoVetor = in.nextInt();

        double[] vetor = new double[tamanhoVetor];
        double soma = 0;

        System.out.println("Insira agora os valores do seu vetor:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Digite o valor na posição " + i);
            vetor[i] = in.nextDouble();
            soma += vetor[i];
        }

        double mediaAritmetica = soma / tamanhoVetor;
        double[] valoresMaisMediaAoQuadrado = new double[tamanhoVetor];
        double somaDosValoresMaisMediaAoQuadrado = 0;

        for (int i = 0; i < tamanhoVetor; i++) {
            valoresMaisMediaAoQuadrado[i] = (vetor[i] - mediaAritmetica) * (vetor[i] - mediaAritmetica);
            somaDosValoresMaisMediaAoQuadrado += valoresMaisMediaAoQuadrado[i];
        }

        double divisaoPeloTamanho = somaDosValoresMaisMediaAoQuadrado / (tamanhoVetor - 1);

        double desvioPadrao = Math.sqrt(divisaoPeloTamanho);

        System.out.println("O desvio padrão de seu vetor é " + desvioPadrao);
    }
}
package Listas.Lista8;

import java.util.Scanner;

public class Gabarito {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        
        // Quantidade de alunos e notas futuras
        System.out.print("Quantidade de alunos: ");
        int alunos = in.nextInt();
        char[] gabarito = new char[5];
        
        
        // gabarito
        for (int i = 0; i < gabarito.length; i++) {
            System.out.print("Questão " + i + " : ");
            gabarito[i] = in.next().toUpperCase().charAt(0);
        }
        
        // Aluno por aluno
        int[] notas = new int[alunos];
        int[] estudantes = new int[alunos];

        for (int i = 0; i < estudantes.length; i++) {
            System.out.println("Aluno " + i);
            char[] respostas = new char[5];
            for (int j = 0; j < respostas.length; j++) {
                System.out.print("Questão " + j+" : ");
                respostas[j] = in.next().toUpperCase().charAt(0);
                if(respostas[j] == 'N') {

                }
                else if (respostas[j] == gabarito[j]) {
                    notas[i] += 2;
                } else {
                    notas[i]--;
                }
            }
            if (notas[i] < 0) notas[i] = 0;
            
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota aluno "+i+" = "+notas[i]);
        }

    }
}

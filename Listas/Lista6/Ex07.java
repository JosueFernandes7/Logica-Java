package Listas.Lista6;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos funcionarios: ");
        int n = in.nextInt();
        float contmediaM = 0, contmediaF = 0;
        float contM = 0, contF = 0;
        float maiorM = Integer.MIN_VALUE;
        float maiorF = Integer.MIN_VALUE;
        String sexo = "";
        float salario = 0;
        while (n != 0) {
            System.out.print("\nSeu nome: ");
            in.next();
            System.out.print("Sexo M/F: ");
            sexo = in.next().toUpperCase();
            System.out.print("Salario: ");
            salario = in.nextFloat();
            if (sexo.equals("M")) {
                contM++;
                contmediaM += salario;
                if (salario > maiorM) {
                    maiorM = salario;
                }
                System.out.println(maiorM);
            }
            if (sexo.equals("F")) {
                contF++;
                contmediaF += salario;
                if (salario > maiorF) {
                    maiorF = salario;
                }

            }
            n--;
        }
        contmediaM /= contM;
        contmediaF /= contF;

        System.out.printf("Maior salario masculino = R$ %.2f\n", maiorM);
        System.out.printf("Maior salario feminino = R$ %.2f\n", maiorF);
        System.out.printf("Media salarial masculina = R$ %.2f\n", contmediaM);
        System.out.printf("Media salarial feminina = R$ %.2f\n", contmediaF);
    }
}

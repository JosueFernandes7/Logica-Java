package Listas.Lista4;

import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome = "", sexo = "";
        String maiorHomem = "", mulherPesada = "";
        int idade, contH = 0, contM = 0;
        float peso, mpesada = 0, altura = 0, hmaior = 0, media = 0;

        while (!nome.equals("@")) {
            System.out.print("Nome: ");
            nome = in.next();
            if (!nome.equals("@")) {
                System.out.print("Sexo: ");
                sexo = in.next().toUpperCase();
                System.out.print("Idade: ");
                idade = in.nextInt();
                System.out.print("Peso: ");
                peso = in.nextFloat();
                System.out.print("Altura: ");
                altura = in.nextFloat();

                media = media + idade;
                if (sexo.equals("MASCULINO")) {
                    if (contH == 0) {
                        hmaior = altura;
                        maiorHomem = nome;
                        contH++;
                    } else if (altura > hmaior) {
                        hmaior = altura;
                        maiorHomem = nome;
                        contH++;
                    }
                }

                if (sexo.equals("FEMININO")) {
                    if (contM == 0) {
                        mpesada = peso;
                        mulherPesada = nome;
                        contM++;
                    } else if (peso > mpesada) {
                        mpesada = peso;
                        mulherPesada = nome;
                        contM++;
                    }
                }
            }
        }
        if (contM == 0 && contH == 0) {
            contH = 1;
        }
        media = media / (contM + contH);
        System.out.println(maiorHomem + " e o atleta mais alto com " + hmaior + " de altura");
        System.out.println(mulherPesada + " e a atleta mais pesada com " + mpesada + " kg");
        System.out.println("Media de idades = " + media);
    }
}
package Listas.Lista4;

import java.util.Scanner;

public class Ex26Antigo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Joao = 0, Eduardo = 0, Jair = 0, branco = 0, nulo = 0;
        int voto = 0;
        int eleitores = 0;
        while (voto != -1) {

            System.out.println("[1] Joao");
            System.out.println("[2] Eduardo");
            System.out.println("[3] Jair");
            System.out.println("[4] Branco");
            System.out.println("[5] Nulo");
            voto = in.nextInt();

            if (voto != -1) {
                eleitores++;

                if (voto == 1) {
                    Joao++;
                } else if (voto == 2) {
                    Eduardo++;
                } else if (voto == 3) {
                    Jair++;
                } else if (voto == 4) {
                    branco++;
                } else if (voto == 5) {
                    nulo++;
                }
            }
        }
        int vencedor = 0;
        String NomeVencedor = "";
        if (Joao > vencedor) {
            vencedor = Joao;
            NomeVencedor = "Joao";
        } else if (Eduardo > vencedor) {
            vencedor = Eduardo;
            NomeVencedor = "Eduardo";
        } else if (Jair > vencedor) {
            vencedor = Jair;
            NomeVencedor = "Jair";
        } else {
            eleitores++;
            if (Joao == Eduardo && Joao > Jair) {
                System.out.println("Empate entre Joao [1] e Eduardo [2] escolha um");
                voto = in.nextInt();
                if (voto == 1) {
                    vencedor = Joao + 1;
                    NomeVencedor = "Joao";
                } else if (voto == 2) {
                    vencedor = Eduardo + 1;
                    NomeVencedor = "Eduardo";
                }
            } else if (Joao == Jair && Joao > Eduardo) {
                System.out.println("Empate entre Joao [1] e Jair [3] escolha um");
                voto = in.nextInt();
                if (voto == 1) {
                    vencedor = Joao + 1;
                    NomeVencedor = "Joao";
                } else if (voto == 3) {
                    vencedor = Jair + 1;
                    NomeVencedor = "Jair";
                }
            } else if (Jair == Eduardo && Jair > Joao) {
                System.out.println("Empate entre Eduardo [2] e Jair [3] escolha um");
                voto = in.nextInt();
                if (voto == 2) {
                    vencedor = Eduardo + 1;
                    NomeVencedor = "Eduardo";
                } else if (voto == 3) {
                    vencedor = Jair + 1;
                    NomeVencedor = "Jair";
                }
            } else if (Jair == Eduardo && Jair == Joao) {
                System.out.println("Empate entre Joao [1] Eduardo [2] e Jair [3] escolha um");
                voto = in.nextInt();
                if (voto == 1) {
                    vencedor = Joao + 1;
                    NomeVencedor = "Joao";
                } else if (voto == 2) {
                    vencedor = Eduardo + 1;
                    NomeVencedor = "Eduardo";
                } else if (voto == 3) {
                    vencedor = Jair + 1;
                    NomeVencedor = "Jair";
                }
            }
        }
        System.out.println("Vencedor = " + NomeVencedor + " com " + vencedor + " voto(s)");
        System.out.println("BRANCOS = " + branco);
        System.out.println("Nulos = " + nulo);
        System.out.println("Eleitores = " + eleitores);
    }
}

package Listas.Lista4;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String Mostrar = "";
        int cont = 1, pessoas, tempo;
        float ganho, total = 0.0f;
        System.out.print("Quantas pessoas trabalham na empresa: ");
        pessoas = in.nextInt();

        // cadastrar cada uma
        while (cont <= pessoas) {
            System.out.println("\nFuncionario " + cont);

            System.out.print("Horas Trabalhadas: ");
            tempo = in.nextInt();

            System.out.print("Ganho por Hora: ");
            ganho = in.nextFloat();

            if (tempo <= 40) {
                total = tempo * ganho;
            } else {
                total = (tempo - 40) * ganho * 1.5f + 40 * ganho;
            }
            Mostrar += "Funcionario " + cont + " Recebeu R$ " + total + "\n";
            cont++;
        }
        System.out.println(Mostrar);
    }

}

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe os elementos da matriz");
        int[][] Ma = new int[5][5];

        for (int i = 0; i < Ma.length; i++) {
            for (int j = 0; j < Ma.length; j++) {
                System.out.print("MATRIZ[" + i + "][" + j + "] = ");
                Ma[i][j] = in.nextInt();
            }
        }
        boolean nenhuma = true;
        System.out.print("Valor de X informado: ");
        int x = in.nextInt();
        for (int i = 0; i < Ma.length; i++) {
            int soma = 0;
            for (int j = 0; j < Ma.length; j++) {
                soma += Ma[i][j];
            }

            if (soma == x) {
                System.out.println("\nLinha " + i);
                nenhuma = false;
            }
        }
        if (nenhuma)
            System.out.println("Nenhuma linha soma o valor informado.");
    }
}
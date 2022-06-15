import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Tamanho da Matriz: ");
        int tam = in.nextInt();

        int[][] matriz = new int[tam][tam];
        int referencia = 0;
        // Preencher a Matriz e pegar a primeira linha como referencia
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("MATRIZ[" + i + "][" + j + "] = ");
                matriz[i][j] = in.nextInt();

                if (i == 0) {
                    referencia += matriz[i][j];
                }
            }

        }

        boolean quadradoMagico = true;

        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            int linha = 0, col = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                linha += matriz[i][j];
                col += matriz[j][i];
                if (i == j) {
                    diagonalPrincipal += matriz[i][j];
                }
                if (i + j == matriz.length - 1) {
                    diagonalSecundaria += matriz[i][j];
                }
            }
            if (linha != referencia) {
                quadradoMagico = false;
                break;
            }

            if (col != referencia) {
                quadradoMagico = false;
                break;
            }

        }

        if (diagonalPrincipal != referencia)
            quadradoMagico = false;
        if (diagonalSecundaria != referencia)
            quadradoMagico = false;

        if (quadradoMagico)
            System.out.println("\n\tEH MATRIZ QUADRADA");
        else
            System.out.println("\n\tNAO EH MATRIZ QUADRADA");

    }
}
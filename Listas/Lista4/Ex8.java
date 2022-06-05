package Listas.Lista4;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantas mercadorias: ");
        int mercadoria = in.nextInt();
        int i = 1, quant;
        float total = 0, media = 0, valor;
        while (i <= mercadoria) {
            System.out.println("MERCADORIA " + i);

            System.out.print("Quantidade: ");
            quant = in.nextInt();

            System.out.print("Valor: ");
            valor = in.nextFloat();

            total = total + quant * valor;
            media = media + valor;
            i++;
        }
        media = media / (i - 1);
        System.out.printf("Total em Estoque R$ %.2f \n", total);
        System.out.printf("Media dos valores R$ %.2f \n", media);
    }
}

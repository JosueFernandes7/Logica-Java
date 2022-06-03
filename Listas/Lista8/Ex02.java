package Listas.Lista8;

import java.util.Scanner;
public class Ex02 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] posicoes = new int[6];
        // 0 é o numero 1, 1 é o numero 2...
        
        do {    
            System.out.print("Qual face: ");
            int valor = in.nextInt();
            posicoes[valor] += 1;
            




        } while(true);
    }
}

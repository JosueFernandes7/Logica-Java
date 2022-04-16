

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Qual valor do saque: ");
        int valor = in.nextInt();
        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0;
        String notas = "";

        if (valor % 2 != 0 && valor % 5 != 0) {
            valor = valor - 5;
            nota5 = 1;
        }
        nota100 = valor / 100;
        valor = valor % 100;
        notas += nota100 + " nota(s) de 100\n";
        
        nota50 = valor / 50;
        valor = valor % 50;
        notas += nota50 + " nota(s) de 50\n";
        
        nota20 = valor / 20;
        valor = valor % 20;
        notas += nota20 + " nota(s) de 20\n";
        
        nota10 = valor / 10;
        valor = valor % 10;
        notas += nota10 + " nota(s) de 10\n";
        
        if (nota5 == 1) {

            nota2 = valor / 2;
            valor = valor % 2;
            notas += nota5 + " nota(s) de 5\n";
            notas += nota2 + " nota(s) de 2\n";
            
        } else {

            nota5 = valor / 5;
            valor = valor % 5;
            notas = nota5 + " nota(s) de 5\n";
        
            nota2 = valor / 2;
            valor = valor % 2;
            notas += nota2 + " nota(s) de 2\n";
        }
        System.out.println(notas);

    }
}

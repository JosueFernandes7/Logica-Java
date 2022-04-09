import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1, contador, validar = 0;
        while (num > 0) {
            System.out.print("Digite um numero: ");
            num = in.nextInt();
            contador = 1;
            validar = 0;
            while (contador * contador <= num) {
                if (num == contador * contador || num == 1) {
                    System.out.println(num + " e um quadrado perfeito pois " + contador + "*" + contador + " = " + num);
                    validar = 1;
                }
                contador++;
            }
            if (validar != 1) {
                System.out.println("nao e um quadrado perfeito");
            }

        }
    }
}

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = in.nextInt();
        if (ano % 400 != 0 && ano % 100 == 0) {
            System.out.println(ano + " nao eh um ano bissexto");
        } else if (ano % 4 == 0) {
            System.out.println(ano + " e um ano bissexto");
        } else {
            System.out.println(ano + " nao eh um ano bissexto");
        }
    }
}

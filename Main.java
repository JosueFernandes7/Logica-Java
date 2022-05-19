import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[100];
        int maior = Integer.MIN_VALUE;
        int pos = 1;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i];
                pos = i + 1;
            }
        }
        System.out.println(maior);
        System.out.println(pos);
    }
}
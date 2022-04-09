import java.util.Scanner;
public  class Ex12 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1;
        System.out.print("Digite um numero multiplo de 5: ");
        num1 = in.nextInt();
        while (num1%5 != 0) {
            System.out.println("Valor Invalido digite novamente ");
            num1 = in.nextInt();
        }

    }
}
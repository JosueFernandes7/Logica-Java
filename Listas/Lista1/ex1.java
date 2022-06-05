package Listas.Lista1;

// FEITO
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, beforeNumber;
        number = in.nextInt();
        beforeNumber = number - 1;
        System.out.println("O numero antecessor de " + number + " e " + beforeNumber);

    }
}
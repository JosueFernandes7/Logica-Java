
import java.util.Scanner;

class fatoracao {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int j = 2, i = 0;
        System.out.println("Fatoracao");
        while (num1 != 0 && j <= num1) {
            i = 0;
            while (num1 % j == 0 && num1 != 0) {
                num1 = num1 / j;
                i = 1;
                System.out.print(j + " ");

            }
            if (i == 1) {
                System.out.println();
            }
            j++;
        }
    }
}

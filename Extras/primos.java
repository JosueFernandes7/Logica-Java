
import java.util.Scanner;

class primos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int primos = 0;
        int j = 1;
        while (num1 <= num2) {
            j = 1;
            primos = 0;
            while (j <= num2) {

                if (num1 % j == 0) {
                    primos++;
                }
                j++;
            }
            if (primos == 2) {
                System.out.println(num1);
            }
            num1++;
        }
    }
}

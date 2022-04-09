import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        while(number <1 || number >10) {
            number = in.nextInt();
        }
        System.out.println("Numero digitado "+number);
    }
}

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("S");
        } else if (a < d + c && d < a + c && c < a + d) {
            System.out.println("S");
        } else if (a < b + d && b < a + d && d < a + b) {
            System.out.println("S");
        } else if (d < b + c && b < d + c && c < d + b) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}

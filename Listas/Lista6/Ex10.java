import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cont = n * 2 - 1;
        int i, j, k;

        for (i = 0; i < n; i++) {
            k = i;
            for (k = i; k > 0; k--) {
                System.out.print(" ");
            }

            for (j = cont; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
            cont -= 2;
            if (cont < 1) break;
        }
    }
}

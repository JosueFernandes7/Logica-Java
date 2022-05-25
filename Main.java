import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distLado=0,distAltura=0;
        int num = 1;
        while(true) {
            num = in.nextInt();
            if(num == 0) break;
            
            int[][] matriz = new int[num][num];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                   distLado = j;
                   distAltura = i;
                   if(distLado == distAltura) {

                   }
                }
            }


        }
    }
}
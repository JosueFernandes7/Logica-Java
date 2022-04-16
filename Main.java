import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int senha = 2002;
        int i = in.nextInt();
        int j=1,resto=0;;
        while(i!=0){
            int num = in.nextInt();
            j=1;
            resto =0;
            while(j<=num){
                if(num%j == 0){
                    resto++;
                }
                j++;
            }
            if(resto == 2){
                System.out.println(num+" eh primo");
            } else {
                System.out.println(num+" nao eh primo");
            }


            i--;
        }
        
    }

}
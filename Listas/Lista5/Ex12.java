import java.io.IOException;
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int x,y;
        do {
            x = in.nextInt();
            y = in.nextInt();
            if(x==y) break;
            if(x>y){
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
        }   while(x!=y);
        
        
    }
}

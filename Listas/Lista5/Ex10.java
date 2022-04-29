import java.io.IOException;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int casos = in.nextInt();
        int x,y,soma;
        do {
            soma =0;
            x = in.nextInt();
            y = in.nextInt();
            if(x > y){
                y++;
                while(y < x){
                    if(y%2 != 0){
                        soma += y;
                    }
                    y++;
                }
            }
            if(y > x){
                x++;
                while(x < y){
                   if(x%2 != 0){
                        soma += x;
                    }
                    x++;
                }
            }
            System.out.println(soma);
            casos--;
        }   while(casos!=0);
        
        
    }
}

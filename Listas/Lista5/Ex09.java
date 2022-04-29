import java.io.IOException;
import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int contpos = 1,pos=0;
        while(contpos <=100){
            int numero = in.nextInt();
            if(numero > maior){
                maior = numero;
                pos = contpos;
            }

            contpos++;
        }
        System.out.println(maior);
        System.out.println(pos);
        
        
        
    }
}

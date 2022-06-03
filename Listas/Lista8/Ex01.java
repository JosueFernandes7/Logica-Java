

import java.util.Scanner;
public class Ex01 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantos numeros serão analisados: ");
        int num = in.nextInt();
        int cont = 1;
        do {
            System.out.println("Numero "+cont);
            String numero = in.next();
            System.out.println("Invertido");
            for(int i=numero.length()-1;i>=0;i--) {
                char c = numero.charAt(i);
                System.out.print(c);
            }
            System.out.println();
            cont++;
            num--;
        } while(num != 0);
    }
}

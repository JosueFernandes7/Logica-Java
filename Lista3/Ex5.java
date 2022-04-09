
import java.util.Scanner;
public class Ex5{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite Tres numeros: ");
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
       if(a < b+c && b < c+a && c<a+b) {
            System.out.println("FORMA TRIANGULO");
       } else {
           System.out.println("NAO FORMA TRIAGULO");
       }
    }
}
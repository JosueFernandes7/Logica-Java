import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Lado do quadrado: ");
        int lado = in.nextInt();
        int i=0,j=0;
        String horizontal = "";
        String vertical = "";
        while (i<lado) {
            horizontal +="* ";
            i++;
        }
        i=0;

        while(i+2<lado){
            vertical +="* ";
            j=0;
            while(j+2<lado){
                vertical +="  ";
                j++;
            }

            i++;
            if(i+2==lado) {
                vertical +="*";
            } else {
                vertical +="*\n";
            }
        }

        System.out.println("QUADRADO DE LADO "+lado);
        System.out.println(horizontal);
        System.out.println(vertical);
        System.out.println(horizontal);
    }
}

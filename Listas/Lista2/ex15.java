// FEITO
import java.util.Scanner;
public class ex15{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Hora de inicio: ");
        int hinicial = in.nextInt();
        System.out.print("Hora de Termino: ");
        int hfinal = in.nextInt();

        int tempo= hfinal-hinicial;

        if( hinicial >= hfinal){
            tempo+=24;
        }
        System.out.println("Tempo de duracao "+tempo+"h");
        

    }
}
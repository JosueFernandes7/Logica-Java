// FEITO
import java.util.Scanner;
public class ex9{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Raio: ");
        float raio = in.nextFloat(),area,comprimento,diametro;
        area = (float)(Math.pow(raio,2)*3.141692);

        diametro = 2*raio;

        comprimento = (float)(2*3.141692*raio);

        System.out.printf("Area = %.2f\n",area);
        System.out.printf("Comprimento = %.2f\n",comprimento);
        System.out.printf("Diametro = %.2f\n",diametro);
        
        

    }
}
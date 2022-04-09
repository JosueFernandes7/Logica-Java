// FEITO
import java.util.Scanner;
public class ex20{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Kilometragem inicial: ");
        float StartK = in.nextFloat();
        
        System.out.print("Kilometragem Final: ");
        float EndK = in.nextFloat();
        
        float kilometragem = EndK-StartK;

        System.out.print("Combustivel Gasto em L: ");
        float Gasol = in.nextFloat();
        
        System.out.print("Valor arrecadado: ");
        float Valor = in.nextFloat();

        float media,lucro;

        media = (float)(kilometragem/Gasol);

        lucro = (float)(Valor - 4.599*Gasol);

        System.out.printf("Media %.2f Km/L\n",media);
        if(lucro >=0){
        System.out.printf("Lucro = R$ %.2f",lucro);

        }
        else{
            System.out.printf("Prejuizo = R$ %.2f",lucro);
        }

        
        
        

    }
}
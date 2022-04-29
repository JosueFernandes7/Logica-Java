// FEITO
import java.util.Scanner;
public class ex25{

    public static void main(String[] args){
        int m1,m50,m25,m10,m05;
        Scanner in = new Scanner(System.in);

        System.out.print("Valor do Produto: ");
        float produto = in.nextFloat();

        System.out.println("\nCofrinho");
        System.out.print("Moedas de 1 real: ");
        m1=in.nextInt();
        System.out.print("Moedas de 50 centavos: ");
        m50=in.nextInt();
        System.out.print("Moedas de 25 centavos: ");
        m25=in.nextInt();
        System.out.print("Moedas de 10 centavos: ");
        m10=in.nextInt();
        System.out.print("Moedas de 5 centavos: ");
        m05=in.nextInt();

        float valor = (float)(m1*1+m50*0.5+m25*0.25+m10*0.1+m05*0.05);
        if(valor >= produto){
            System.out.println("E o bastante");
        }
        else{
            System.out.printf("Ainda falta R$ %.2f",(produto-valor));
        }

    }
}
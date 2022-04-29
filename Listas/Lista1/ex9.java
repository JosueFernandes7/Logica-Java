// FEITO
import java.util.Scanner;
public class ex9{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int man,woman,kid;
        float people;
        System.out.println("CHURRASCAO");
        System.out.println("==========");
        System.out.print("Numero de Homens: ");
        man = in.nextInt();
        System.out.print("Numero de Mulheres: ");
        woman = in.nextInt();
        System.out.print("Numero de Criancas: ");
        kid = in.nextInt();

        people = (float)((man*400 + woman*320 + kid*200)*1.2/1000);
        System.out.printf("\n\tSera necessario: %.2fKg(s) de Carne",people);
    }
}
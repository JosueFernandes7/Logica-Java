// FEITO
import java.util.Scanner;
public class ex13{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nota1: ");
        float nota1 = in.nextFloat();
        System.out.print("Nota1: ");
        float nota2 = in.nextFloat();
        float media = (nota1+nota2)/2;
        if(media >=6){
            System.out.printf("Aluno Aprovado!!\n\tMedia = %.2f",media);
        }
        else{
            System.out.printf("Aluno Reprovado!!\n\tMedia = %.2f",media);
        }
        

    }
}
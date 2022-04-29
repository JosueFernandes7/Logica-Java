
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        float nota1 = in.nextFloat();

        System.out.println("Digite a nota 2");
        float nota2 = in.nextFloat();

        System.out.println("Digite a nota da optativa 'se nao fez digite -1'");
        float notaOptativa = in.nextFloat();

        if(nota1<notaOptativa && notaOptativa != -1) {
            nota1 = notaOptativa;
        } else if(nota2<notaOptativa && notaOptativa != -1) {
            nota2 = notaOptativa;
        } else {
            
        }

        float media = (nota1+nota2)/2;
        if(media < 3) {
            System.out.println("Reprovado");
        } else if(media <6) {
            System.out.println("Exame");
        } else {
            System.out.println("Aprovado");
        }
        System.out.printf("media = %.2f",media);
    }
}

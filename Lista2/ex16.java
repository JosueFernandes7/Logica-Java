// FEITO
import java.util.Scanner;
public class ex16{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Seu salario: ");
        float salario = in.nextFloat();
        while(salario <= 0){
            System.out.print("Valor invalido Digite novamente: ");
            salario = in.nextFloat();
        }


        System.out.print("Valor do emprestimo R$: ");
        float emprestimo = in.nextFloat();
         while(emprestimo <= 0){
            System.out.print("Valor invalido Digite novamente: ");
            emprestimo = in.nextFloat();
        }

        System.out.print("Numero de prestacoes: ");
        int prestacoes = in.nextInt();
        while(prestacoes <= 0){
            System.out.print("Valor invalido Digite novamente: ");
            prestacoes = in.nextInt();
        }

        float prestacaoTotal = (float)(emprestimo/prestacoes);
        
        if(prestacaoTotal > salario*0.3){
            System.out.println("Emprestimo recusado");
        }
        else{
            System.out.println("Emprestimo Concedido");
        }
        
        

    }
}
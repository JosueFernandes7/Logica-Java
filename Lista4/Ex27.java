import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        int n,contDobro=0,num;
        int dobro=0;
            System.out.println("Digite um numero: ");
            num = in.nextInt();
            System.out.println("Quantas vezes o dobro: ");
            n = in.nextInt();
            dobro = num;
            while (n!=0 && soma < 100000 && dobro < 100000 ){
            dobro = dobro*num;
            if(contDobro == 0){
                soma = dobro;
                contDobro++;
            } else {

                soma = dobro + dobro/2;
            }
            
            System.out.println("Dobro = "+dobro+" \tSoma com Antecessor = "+soma);

            n--;
        }
    }
}

import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1,j=1,k=0; // i = numerador e j = denominador nao precisaria do k
        int contFatorial=1,Fatorial=1; 
        String Somatorio = "";
        System.out.print("Quantos termos vc deseja: ");
        int n = in.nextInt();
        double soma=0;
        while(k < n) {
            Fatorial = 1;
            contFatorial =1;
            while(contFatorial<=j) {
                Fatorial = contFatorial*Fatorial;
                contFatorial++;
            }
            if(n-1 == k) { // quando  o i é o ultimo pra nao ter o + no fim
                Somatorio += i+"/"+j+"!";
            } else {
                Somatorio += i+"/"+j+"! + ";
            }
            soma = soma + (double)i/Fatorial;
            i++;
            j+=2;
            k++;
        }
        System.out.println(Somatorio);
        System.out.printf("SOMA = %.5f",soma);
    }
}
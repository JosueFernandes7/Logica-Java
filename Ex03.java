import java.util.Scanner;
public class Ex03 {
    
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int faixa1=0,faixa2=0,faixa3=0,faixa4=0,faixa5=0,faixa6=0;
        double peso,altura,imc;
        do{
            System.out.print("Seu Peso em Kg: ");
            peso = in.nextDouble();
            System.out.print("Sua Altura em m: ");
            altura = in.nextDouble();
            if(altura == 0) break;
            imc = peso/Math.pow(altura,2);
            if(imc < 18.5){
                faixa1++;
            } else if(imc <25){
                faixa2++;
            } else if(imc < 30){
                faixa3++;
            } else if(imc < 35) {
                faixa4++;
            } else if(imc < 40) {
                faixa5++;
            } else {
                faixa6++;
            }
        } while(altura != 0);
        System.out.println("Abaixo do peso = "+faixa1);
        System.out.println("Peso normal = "+faixa2);
        System.out.println("Sobrepeso = "+faixa3);
        System.out.println("Obesidade Grau I = "+faixa4);
        System.out.println("Obesidade Grau II = "+faixa5);
        System.out.println("Obesidade Grau III = "+faixa6);
    }
}

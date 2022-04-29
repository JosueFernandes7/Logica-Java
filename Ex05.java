import java.util.Scanner;
public class Ex05 {
    
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = 5;
        double e = 0,fatorial=1;
        double numero = in.nextDouble();
        double numerador=0;
        int j = 1;
        while(n!=0){
            fatorial = 1;
            if(e == 0){
                e=1;
            }else{
                numerador=1;
                for(int i = 1;i<=j;i++){
                    fatorial = fatorial*i;
                    numerador *= numero;
                }
                // double numerador = Math.pow(numero,j);
                e += numerador/fatorial;
                j++;
            }
            n--;
        }
        System.out.printf("E = %.2f",e);
    }
}

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a quantidade de valores: ");
        int valores = in.nextInt();
        int quedas = 0;
        int numero,anterior=0,contnum=0;
        
        while(valores != 0){
            numero = in.nextInt();
            if(contnum == 0){
                anterior = numero;
                contnum=1;
            }
            if(numero < anterior){
                quedas++;
            }

            anterior = numero;
            valores--;
        }
        System.out.println("Resultado = "+quedas+" quedas");
    }
}

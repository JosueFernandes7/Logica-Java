
import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        int invertido = 0, NumeroAuxiliar = numero;
        int cont = 0;

        while (NumeroAuxiliar >= 10) {
            NumeroAuxiliar = NumeroAuxiliar / 10;
            cont++;
        }
        // verifica quandas potencias ex 1 = até 10^1
        while (cont >= 0) {
            int contAuxiliar = cont;
            int potencia = 1;
            while (contAuxiliar > 0) { // faz a potencia 10^n
                potencia = potencia * 10;
                contAuxiliar--;
            }
            invertido += numero % 10 * potencia;
            numero = numero / 10;
            cont--;
        }
        System.out.println(invertido);
    }
}

import java.util.Scanner;
public  class Ex11 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.print("Digite o valor 1: ");   
        num1 = in.nextInt();
        System.out.print("Digite o valor 2: ");   
        num2 = in.nextInt();
        while ( num2 == 0 ) {
            System.out.print("Valor igual a zero digite novamente: ");
            num2 = in.nextInt();
        }
        float divisao = num1/num2;
        System.out.printf("\n\nDivisao de %d por %d = %.2f\n",num1,num2,divisao);
    }
}
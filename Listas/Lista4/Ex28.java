import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dinheiro=-1,i=-1;
        int nota100,nota50,nota10,nota5,nota1;

        while(i != 0){
            System.out.print("Qual valor a ser sacado: ");
            dinheiro = in.nextInt();
            i=dinheiro;
            // 100 reais
            if(dinheiro / 100 > 0){
                nota100 = dinheiro/100;
                dinheiro %= 100;
                System.out.println(nota100+" nota(s) de R$ 100");
            } 
            // 50 reais
            if(dinheiro / 50 > 0){
                nota50 = dinheiro/50;
                dinheiro %= 50;
                System.out.println(nota50+" nota(s) de R$ 50");
            }
            // 10 reais
            if(dinheiro / 10 > 0){
                nota10 = dinheiro/10;
                dinheiro %= 10;
                System.out.println(nota10+" nota(s) de R$ 10");
            }
            // 5 reais
            if(dinheiro / 5 > 0){
                nota5 = dinheiro/5;
                dinheiro %= 5;
                System.out.println(nota5+" nota(s) de R$ 5");
            }
            // 1 real
            if(dinheiro > 0){
                nota1 = dinheiro;
                dinheiro %= 1;
                System.out.println(nota1+" nota(s) de R$ 1");
            }
        }
    }
}

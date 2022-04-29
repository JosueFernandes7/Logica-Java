import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos;
        int comprimento,varetas,soma;
        String quantidade = "";
        do {
            soma =0;
            casos = in.nextInt();
            if (casos == 0)
                break;
            int i =0;
            while(i<casos){
                comprimento = in.nextInt();
                varetas = in.nextInt();

                if(varetas %2 != 0) varetas--; 
                soma+=varetas;
                i++;
            }
            soma = soma/4;
            quantidade += soma+"\n";


        } while (casos != 0);
        System.out.println(quantidade);
    }
}

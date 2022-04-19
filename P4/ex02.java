import java.util.Scanner;

public class ex02 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int total = 0;
        int idade = 0;
        while(idade != -1){
            System.out.print("Idade: ");
            idade = in.nextInt();
            if(idade != -1){
                total += 100;
                if(idade < 10){
                    total += 80;
                } else if(idade <= 30) {
                    total += 50;
                } else if(idade>=40 && idade <=60){
                    total+=95;
                } else if(idade > 60) {
                    total += 130;
                }

            }

        }
        System.out.println("Resultado sera: "+total);
    }
}

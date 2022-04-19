import java.util.Scanner;

public class ex05 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int x=1,y=2,z=1;
        int soma =0;

        while(x!=0 || y!=0 || z!=0){
            soma =0;
            System.out.println("X Y Z RESPECTIVAMENTE");
             x = in.nextInt();
             y = in.nextInt();
             z = in.nextInt();
            if(x!=0 || y!=0 || z!=0){
                while(x<=y){
                    soma += x;
                    x += z;
                }
                System.out.println("Soma = "+soma);
            }
        }
    }
}

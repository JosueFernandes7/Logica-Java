

import java.util.Scanner;
public class ex02 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int i=1;
        int tomadas=0;
        int regua=0;
        while(i<=4){
            System.out.print(i+" Regua: ");
            regua = in.nextInt();
            if(i!=4){
                tomadas+= regua-1;
            } else {
                tomadas+= regua;
            }
            i++;
        }
        System.out.println("Total de tomadas: "+tomadas);
    }
}

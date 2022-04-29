import java.util.Scanner;
public class Ex06 {
    
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int num1=0,num2=1,num3;
        String fibo = "";
        if(1<=n){
            fibo += "0";
        } 
        if(2<=n){
            fibo+=", 1";
        } 
            
        for(int i = 2;i<n;i++){
             num3 = num2+num1;
            fibo += ", "+num3;
            num1 = num2;
            num2 = num3;
        }
        
        System.out.println(fibo);
    }
}

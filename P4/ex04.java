import java.util.Scanner;

public class ex04 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double x,y;
        System.out.print("X = ");
        x = in.nextDouble();
        System.out.print("Y = ");
        y = in.nextDouble();
        if(x==0 && y==0){
            System.out.println("Origem");
        } else if(x==0  ){
            System.out.println("Eixo vertical");
        } else if(y==0){
            System.out.println("Eixo horizontal");
        } else if(x>0 && y>0){
            System.out.println("Primeiro Quadrante");
        } else if(x<0 && y>0){
            System.out.println("Segundo Quadrante");
        } else if(x<0 && y<0){
            System.out.println("Terceiro Quadrante");
        } else if(x>0 && y<0){
            System.out.println("Quarto Quadrante");
        }
    }
}

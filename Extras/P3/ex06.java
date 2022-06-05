package Extras.P3;


import java.util.Scanner;
public class ex06 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int min,max,atual;
        double media;
        System.out.print("Produto: ");
        in.next();
        System.out.print("Quantidade Minima de produto: ");
        min = in.nextInt();
        System.out.print("Quantidade Maxima de produto: ");
        max = in.nextInt();
        System.out.print("Quantidade Atual de produto: ");
        atual = in.nextInt();
        media = (max+min)/2;
        if(atual < media){
            System.out.println("Respota: Fazer Compra");
        } else {
            System.out.println("Respota: Nao eh necessario");
        }
    }
}
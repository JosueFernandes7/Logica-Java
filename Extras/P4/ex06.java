package Extras.P4;

import java.util.Scanner;

public class ex06 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String palavra = in.next();
        int i =0,j=0,forte=0;
        while(i<palavra.length()){
            char letra1 = palavra.charAt(i);
            j = i+1;
            while(j<palavra.length()){
                char letra2 = palavra.charAt(j);
                if(letra1== letra2){
                    forte++;
                }
                j++;
            }
            i++;
        }
        if(forte ==0){
            System.out.println("Senha forte");
        } else {
            System.out.println("Senha fraca");
        }
    }
}

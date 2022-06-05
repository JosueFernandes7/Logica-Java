package Extras.P3;


import java.util.Scanner;
public class ex07 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String word = in.next();
        
        // 1 - forma com StringBuilder() + reverse()
        // String reverse = new StringBuilder(word).reverse().toString();
        // System.out.println(reverse);

        // 2 - forma usando charAt();
        String reversa = "";
        int i =0;
        for( i = word.length()-1 ; i >= 0; i--) {
            reversa += word.charAt(i);
        }
        System.out.println(reversa);
        
    }
    
}

package Extras.P3;


import java.util.Scanner;
public class ex05 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int nota = 0;
        System.out.print("Digite a nota desejada e valor equivalente na escala: ");
        String escolha = in.next().toLowerCase();
        String terca="";
        nota = in.nextInt();
        if(nota<=5){
            nota= nota+2;
        } else {
            nota = nota-5;
        }
        if(nota == 1){
            terca="do";
        } else if(nota == 2){
            terca="re";
        } else if(nota == 3){
            terca="mi";
        } else if(nota == 4){
            terca="fa";
        } else if(nota == 5){
            terca="sol";
        } else if(nota == 6){
            terca="la";
        } else if(nota == 7){
            terca="si";
        }
        System.out.println("A terca de "+escolha+" e a nota "+terca);

        
    }
}
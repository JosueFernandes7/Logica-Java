
import java.util.Scanner;

class binario {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // System.out.println("[1] Binario to Decimal");
        // System.out.println("[2] Decimal to binario");
        int num = 1023223;

        String binario = num+"";
        int j = 0;
        while(j<binario.length()){
            int pos = binario.charAt(j);
            System.out.println(pos);
            j++;
        }
       // Decimal to binario
        // String Numero = "";
        // while(num>=2 &&){
        //     Numero += num%2+"";
        //     num = num/2;
        // }
        // Numero +=num+"";
        // String NovoNumero="";
        // int i = Numero.length()-1;
        // while(i>=0){
        //     char pos = Numero.charAt(i);
        //     NovoNumero += pos+"";
        //     i--;
        // }

        
       
    }
}

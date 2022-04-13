import java.util.Scanner;
public class Ex29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int i=1,j=0,k=0;
        int produto =1;
        int contline =0;
        // i casa centena
        // j dezena
        // k unidade
       while(i<=9) {
            j=0;
            while(j<=9){
                k=0;
                produto = 1;
                while(k<=9){
                    produto = i*j*k;
                    System.out.print(i+""+j+""+k+" ("+i+"*"+j+"*"+k+"*)");
                    System.out.println(" = "+produto);
                    contline++;
                    if(contline % 20 == 0){
                        System.out.println("(...)");
                        System.out.print("Para Continuar Aperte Qualquer tecla: ");
                        in.next();
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
    }
}

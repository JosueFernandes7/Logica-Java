import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        // salario > 0;
        System.out.println("Digite seu salario: ");
        float salario = in.nextFloat();
        while ( salario < 0){
            System.out.print("Salario invalido Digite novamente: ");
            salario = in.nextFloat();
        }
    }
    
}

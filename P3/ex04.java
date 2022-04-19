
import java.util.Scanner;
public class ex04 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String escolha = "";
        System.out.print("Quantas pessoas vao viajar: ");
        int alunos = in.nextInt();
        System.out.print("Preco da passagem: ");
        double passagem = in.nextDouble();
        System.out.print("\nDistancia entre as duas cidades: ");
        double dist = in.nextDouble();
        System.out.print("Preco da gasolina: ");
        double gasol = in.nextDouble();
        System.out.print("Quantos Kilometros por litro: ");
        double kml = in.nextDouble();
        double total = dist/kml*gasol;

        passagem = passagem*alunos;
        if(passagem < total){
            escolha = "Onibus";
        } else if(passagem > total){
            escolha = "Carro";
        } else {
            escolha = "Os dois deram o mesmo preco";
        }
        System.out.printf("Carro %.2f R$\n",total);
        System.out.printf("Onibus %.2f R$\n",passagem);
        System.out.println("\tEscolha = "+escolha);
    }
}
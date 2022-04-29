import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float populacaoX,populacaoY;
        System.out.print("Populacao X: ");
        populacaoX = in.nextFloat();
        System.out.print("Populacao Y: ");
        populacaoY = in.nextFloat();
        int i=1;
        while(populacaoX < populacaoY) {
            populacaoX = populacaoX*1.03f;
            populacaoY = populacaoY*1.02f;
            i++;
        }
        System.out.println("FORAM NECESSARIOS "+i+" ANOS");
        System.out.printf("POPULACAO X = %.0f\n",populacaoX);
        System.out.printf("POPULACAO Y = %.0f\n",populacaoY);
    }
}
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int n = in.nextInt();

        double media = 0;
        double[] vetor = new double[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor[" + i + "] = ");
            vetor[i] = in.nextDouble();
            media += vetor[i];
        }
        media /= vetor.length;
        System.out.println(media);
        double dp = 0;

        for (int i = 0; i < vetor.length; i++) {
            dp += ((vetor[i] - media) * (vetor[i] - media));
        }
        dp = Math.sqrt(dp / (vetor.length - 1));
        System.out.printf("Desvio Padrao = %4f\n", dp);
    }
}
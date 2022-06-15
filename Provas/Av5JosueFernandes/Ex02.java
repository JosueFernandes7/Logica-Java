import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Qual o tamanho do vetor A: ");
        int tamA = in.nextInt();
        int[] vA = new int[tamA];

        System.out.print("Qual o tamanho do vetor B: ");
        int tamB = in.nextInt();
        int[] vB = new int[tamB];

        // vA
        System.out.println("VETOR A");

        for (int i = 0; i < vA.length; i++) {
            System.out.print("VetorA[" + i + "] = ");
            vA[i] = in.nextInt();
        }
        // vB
        System.out.println("VETOR B");
        for (int i = 0; i < vB.length; i++) {
            System.out.print("VetorB[" + i + "] = ");
            vB[i] = in.nextInt();
        }
        int subconjunto = vB.length;
        // Comparando
        for (int i = 0; i < vB.length; i++) {
            for (int j = 0; j < vA.length; j++) {
                if (vB[i] == vA[j]) {
                    subconjunto--;
                    break;
                }
            }
        }
        if (subconjunto == 0)
            System.out.println("B eh subconjunto de A");
        else
            System.out.println("B nao eh subconjunto de A");

    }
}
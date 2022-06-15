
public class BubbleSort {
    public static void main(String[] args) {

        int[] vet = { 2, 4, 5, 1, 3 };
        int N = vet.length;

        for (int i = 0; i < N; i++) {
            System.out.print(vet[i] + "  ");
        }
        System.out.println();

        boolean troca;
        int troquei = 0;
        do {
            troca = false;

            for (int i = 1; i < N; i++) {

                if (vet[i - 1] > vet[i]) {
                    troca = true;
                    troquei++;
                    int aux = vet[i - 1];
                    vet[i - 1] = vet[i];
                    vet[i] = aux;
                }

            }

            for (int i = 0; i < N; i++) {
                System.out.print(vet[i] + "  ");
            }
            System.out.println();

        } while (troca == true);

        System.out.println("Total de swaps = " + troquei);
    }
}
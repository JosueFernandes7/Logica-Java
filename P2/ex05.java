import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double taxa1 = 1, taxa2 = 1;
        int populacao1 = 1, populacao2 = 1;

        while (populacao1 != 0 && populacao2 != 0) {
            System.out.print("Informe a populacao e a taxa do primeiro pais: ");
            populacao1 = in.nextInt();
            taxa1 = in.nextDouble() / 100;

            System.out.print("Informe a populacao e a taxa do segundo pais: ");
            populacao2 = in.nextInt();
            taxa2 = in.nextDouble() / 100;

            if (populacao1 != 0 && populacao2 != 0) {

                if (taxa1 >= taxa2) {
                    System.out.println("O segundo pais nao ultrapassara o primeiro.");
                } else {
                    int tempo = 0;
                    while (populacao2 < populacao1 && tempo <= 100) {
                        populacao1 = (int) (populacao1 * (taxa1 + 1));
                        populacao2 = (int) (populacao2 * (taxa2 + 1));
                        tempo++;
                    }
                    if (tempo > 100) {
                        System.out.println("Uma eternidade passara");
                    } else {

                        System.out.println("Em " + tempo
                                + " anos o tamanho da populacao do segundo pais ultrapassara a do primeiro.");
                    }
                }

            }
        }
    }
}

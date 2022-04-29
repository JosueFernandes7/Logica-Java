import java.util.Scanner;
public  class Ex13 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont=1;
        float nota,menor=0.0f,media=0.0f;
        System.out.print("Nota 0: ");
        nota = in.nextFloat();
        menor = nota;
        media = nota;
        while (cont<3) {
            System.out.print("Nota "+cont+" : ");
            nota = in.nextFloat();
            media = media + nota;
            if(nota < menor) {
                menor = nota;
            }
            cont++;
        }
        media = (media-menor)/2;
        System.out.printf("Media = %.2f",media);
    }
}
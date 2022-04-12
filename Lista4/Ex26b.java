import java.util.Scanner;
public class Ex26b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("[1]Branco [2] Nulo [3] candidatoA [4] candidatoB [5] candidatoC ");
        int voto=0;
        int branco=0,nulo=0,A=0,B=0,C=0;
        while(voto != -1) {
            voto = in.nextInt();
            if(voto == 1) {
                branco++;
            } else if(voto == 2) {
                nulo++;
            } else if(voto == 3) {
                A++;
            } else if(voto == 4) {
                B++;
            } else if(voto == 5) {
                C++;
            }
        }
        int eleitores = branco + nulo + A + B + C;
        int vencedor = 0;
        String nomeVenc = "";
        if(A > vencedor){
            vencedor = A;
            nomeVenc = "3";
        }
        if(B > vencedor){
            vencedor = B;
            nomeVenc = "4";
        }
        if(C > vencedor){
            vencedor = C;
            nomeVenc = "5";
        } else {
            eleitores++;
            if(A==B || B==C || A==C) {
                System.out.println("VOTO(S) A [3]"+A);
                System.out.println("VOTO(S) B [4]"+B);
                System.out.println("VOTO(S) C [5]"+C);
                System.out.println("DESEMPATE");
                nomeVenc = in.next();
            }
        }
        System.out.println("Numero do candidato vencedor: "+nomeVenc);
    }
}

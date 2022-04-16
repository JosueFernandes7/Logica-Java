import java.util.Scanner;
public class ex08 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double teoriaA,praticaA;
        double teoriaB,praticaB;
        int bonusA=-1,bonusB=-1;
        double mediaA,mediaB;
        double pontuacaoA,pontuacaoB;
        System.out.print("Quantas partidas: ");
        int i =1,partidas=in.nextInt();;
        while(i<=partidas){

            System.out.print("#"+i+" Carta A: ");
            teoriaA = in.nextDouble();
            praticaA = in.nextDouble();
            System.out.print("#"+i+" Carta B: ");
            teoriaB = in.nextDouble();
            praticaB = in.nextDouble();
    
            mediaA = (teoriaA+praticaA)/2;
            mediaB = (teoriaB+praticaB)/2;
            
            while(bonusA > 6 || bonusA < 1){
                bonusA = (int)(Math.random()*100);;
            }
            while(bonusB > 6 || bonusB < 1){
                bonusB = (int)(Math.random()*100);;
            }
            System.out.print("#"+i+" Carta A: "+mediaA+" + "+bonusA);
            System.out.print("\n#"+i+" Carta B : "+mediaB+" + "+bonusB+"\n");
            pontuacaoA = mediaA + bonusA;
            pontuacaoB = mediaB + bonusB;
            if(pontuacaoA>pontuacaoB){
                System.out.println("A VENCEU");
            } else if(pontuacaoA == pontuacaoB){
                System.out.println("EMPATE");
            } else {
                System.out.println("B VENCEU");
            }
            i++;
        }
    }
}

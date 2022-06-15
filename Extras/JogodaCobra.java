import java.util.Scanner;

import java.util.Random;

public class JogodaCobra {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String tabuleiro[][] = new String [5][5];
        String digitado = "";
        boolean saida = false;
        int xAtual = 0, yAtual = 0;

        for(int i=0; i< tabuleiro.length; i++ ){
            for( int j=0; j < tabuleiro.length; j++){
                tabuleiro[i][j] = "+"; 
            }
        }
        int xSorteado = random.nextInt(4);
        int ySorteado = random.nextInt(4);

        System.out.println("Posições sorteadas: X -> "+ xSorteado + "    Y -> "+ySorteado);
        tabuleiro[2][2] = "o";

        do{
            
            for (int i = 0; i < tabuleiro.length; i++) {
                System.out.println();
                for (int j = 0; j < tabuleiro.length; j++) {
                    if(tabuleiro[i][j] == "o"){
                        xAtual = i;
                        yAtual = j;
                    }
                    System.out.print(tabuleiro[i][j] + "  ");
                }
            }
            System.out.println();

            System.out.println("Mexa sua peça, com as teclas:");
            System.out.println("A ===> Esquerda");
            System.out.println("D ===> Direita");
            System.out.println("S ===> Baixo");
            System.out.println("A ===> Cima");
            System.out.println("0 ===> SAIR");
            digitado = scanner.next();

            switch (digitado){
                case "a":
                    if(yAtual >= 1) {  
                        tabuleiro[xAtual][yAtual] = "+";
                        if(xAtual == xSorteado && (yAtual-1) == ySorteado){
                            tabuleiro[xAtual][yAtual-1] = "O";
                        }else{
                            tabuleiro[xAtual][yAtual - 1] = "o";
                        }
                        
                    }
                break;
                case "d":
                    if (yAtual < 4){
                        tabuleiro[xAtual][yAtual] = "+";
                        if(xAtual == xSorteado && (yAtual+1) == ySorteado){
                            tabuleiro[xAtual][yAtual + 1] = "O";
                        }else{
                            tabuleiro[xAtual][yAtual + 1] = "o";
                        }

                    }
                break;
                case "w":
                    if (xAtual >= 1){
                        tabuleiro[xAtual][yAtual] = "+";
                        if((xAtual-1) == xSorteado && yAtual == ySorteado){
                            tabuleiro[xAtual - 1][yAtual] = "O";
                        }else{
                            tabuleiro[xAtual - 1][yAtual] = "o";
                        }
                    }
                break;
                case "s":
                    if (xAtual < 4){
                        tabuleiro[xAtual][yAtual] = "+";
                        if((xAtual+1) == xSorteado && yAtual == ySorteado){
                            tabuleiro[xAtual + 1][yAtual] = "O";
                        }else{
                            tabuleiro[xAtual + 1][yAtual] = "o";
                        }
                    }
                break;
                case "0":
                    System.out.println("Saindo!");
                    saida = true;

                break;
                default:
                    System.out.println("Não é uma opção válida");
            }

        }while(saida == false);

    }
}
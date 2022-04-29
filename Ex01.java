import java.util.Scanner;
public class Ex01 {
    
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        // a) o número de funcionárias concursadas;
        // b) o número de funcionários (somente homens);
        // c) a maior idade dos homens concursados;
        // d) a quantidade de mulheres com mais de 30 anos sem concurso;
        // e) a quantidade de concursados(as);
        // f) a média das alturas dos homens com menos de 40 anos
        int funcionariasConcursadas=0,funcionariosHomens=0;
        int maiorHomem = Integer.MIN_VALUE,mulhermaisde30 = 0;
        int concursados=0;
        float media =0,contmedia=0,altura;
        int matricula,idade;
        char concursado,sexo;
        char Homem = 'H';
        char Mulher = 'M';
        char sim = 'S';
        char nao = 'N';
        do {
            System.out.print("\nSua matricula: ");
            matricula = in.nextInt();
            if(matricula == 0) break;
            System.out.print("Sua idade: ");
            idade = in.nextInt();

            System.out.print("Seu sexo H/M: ");
            sexo = in.next().toUpperCase().charAt(0);

            System.out.print("Sua altura: ");
            altura = in.nextFloat();

            System.out.print("Concursado S/N: ");
            concursado = in.next().toUpperCase().charAt(0);

            if(sexo == Homem) {
                funcionariosHomens++;
                media += altura;
                contmedia++;
                if(concursado == sim && idade > maiorHomem) {
                    maiorHomem = idade;
                }
            }
            if(sexo == Mulher) {
                if(concursado == sim) {
                    funcionariasConcursadas++;
                } else if(concursado == nao && idade > 30) {
                    mulhermaisde30++;
                }
            }
            if(concursado == sim) {
                concursados++;
            }

        } while(matricula != 0);
        media = media/contmedia;
        System.out.println("Mulheres Concursadas "+funcionariasConcursadas);
        System.out.println("Funcionarios homens "+funcionariosHomens);
        System.out.println("Maior Homem concursado "+maiorHomem);
        System.out.println("Mulheres +30 com concurso "+mulhermaisde30);
        System.out.println("Concursados = "+concursados);
        System.out.printf("Media alturas Homens -40anos = %.2f",media);
    }
}

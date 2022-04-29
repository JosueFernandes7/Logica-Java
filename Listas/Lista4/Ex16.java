import java.util.Scanner;
public  class Ex16 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=1,num,exp,result=1;
        System.out.print("Digite um numero: ");
        num = in.nextInt();
        System.out.print("Qual o expoente desejado: ");
        exp = in.nextInt();
        while (i <=exp) {
            result = result*num;
            i++;
        }
        System.out.println(num+" elevado a "+exp+" = "+result);
    }
}
import java.util.Scanner;
public class Ex11 {
    
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int lin = in.nextInt();
        int col = in.nextInt();
        String horizontal = " ";
        String vertical = "\n\n";
        String retangulo = "";
        int i,j;
        for(i = lin;i>0;i--){
           vertical+= "|";
           for(j = col;j>0;j--){
            vertical+= " ";
            }
            if(i == 1) vertical+="|\n";
            else  vertical+= "|\n\n";
           
        }
        for(i = col;i>0;i--){
            horizontal+= "_";
        }
        horizontal+=" ";
        retangulo += horizontal+vertical+horizontal;
        System.out.println(retangulo);
    }
}

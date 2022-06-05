package Extras.P3;

import java.util.Scanner;
public class ex03 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int horas=0,minutos=0,segundos=0,total=0;
        System.out.println("[1] hh:mm:ss => s");
        System.out.println("[2] s => hh:mm:ss");
        int i = in.nextInt();
        System.out.print("Digite o horario no modo selecionado: ");
        if(i==1){
            horas = in.nextInt();
            minutos = in.nextInt();
            segundos = in.nextInt();
            total = horas*3600 + minutos*60 + segundos;
            System.out.println(horas+":"+minutos+":"+segundos+" => "+total+"s");
        } else if(i==2){
            total = in.nextInt();
            horas = total/3600;
            minutos = (total%3600)/60;
            segundos =(total%3600)%60;

            System.out.println(total+"s => "+horas+":"+minutos+":"+segundos);
        }
    }
}

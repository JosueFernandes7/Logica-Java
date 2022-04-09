import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int dia1, dia2, h1, m1, s1, h2, m2, s2;
        String day;

        // 1 entrada
        day = in.next();
        dia1 = in.nextInt();
        h1 = in.nextInt();
        in.next();
        m1 = in.nextInt();
        in.next();
        s1 = in.nextInt();
        // 2 entrada
        day = in.next();
        dia2 = in.nextInt();
        h2 = in.nextInt();
        in.next();
        m2 = in.nextInt();
        in.next();
        s2 = in.nextInt();

        int dia, hora, minuto, segundo;
        dia = dia2 - dia1;
        hora = h2 - h1;
        minuto = m2 - m1;
        segundo = s2 - s1;

        if (segundo < 0) {
            segundo += 60;
            minuto -= 1;
        }

        if (minuto < 0) {
            minuto +=60;
            hora -= 1;
        }

        if (hora < 0) {
            hora+=24;
            dia-=1;
        }

        System.out.println(dia + " dia(s)");
        System.out.println(hora + " hora(s)");
        System.out.println(minuto + " minuto(s)");
        System.out.println(segundo + " segundo(s)");

    }
}
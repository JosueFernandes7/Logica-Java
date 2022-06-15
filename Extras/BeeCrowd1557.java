import java.util.Scanner;

public class BeeCrowd1557 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    do {
      int num = in.nextInt();
      int[][] Ma = new int[num][num];
      if (num == 0)
        break;

      for (int i = 0; i < Ma.length; i++) {
        for (int j = 0; j < Ma.length; j++) {

          int menor = j + 1;
          if (Ma[i].length - j < menor)
            menor = Ma[i].length - j;
          if (i + 1 < menor)
            menor = i + 1;
          if (Ma.length - i < menor)
            menor = Ma.length - i;

          System.out.printf("%3d", menor);

          if (j < Ma[i].length - 1)
            System.out.print(" ");
          else
            System.out.print("\n");
        }

      }
      System.out.println();
    } while (true);

  }
}
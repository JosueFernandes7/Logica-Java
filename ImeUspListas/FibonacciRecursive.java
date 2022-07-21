import java.util.Scanner;
public class FibonacciRecursive{

  public static int fibonnaci(int n) {
    if(n <= 1) {return n;}
    else return fibonnaci(n-1) + fibonnaci(n-2);
  }
  public static void main(String[] agrs) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for (int i = 1; i <= num; i++) {
      System.out.println(fibonnaci(i));
    }
  }
}
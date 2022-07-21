public class vetor {
  
  public static void main(String[] args) {

    int[][] matriz = new int[5][5];
    Utils.lotarMatriz(matriz,10);

    for (int[][] is : matriz) {
      System.out.println(is);
    }
  }
}

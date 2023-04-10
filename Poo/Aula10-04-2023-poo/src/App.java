class App {
  public static void main(String[] args) {
    Cor c = Cor.rgb(120, 100, 23);

    System.out.println(c.getRed()); // 120
    System.out.println(c.getGreen()); // 100
    System.out.println(c.getBlue()); // 23

    Cor c2 = Cor.string("120 100 22"); // convenção do formato
    // c2.rgb(93, 12, 34);
    Cor c3 = Cor.hsl(200, 0.8, 0.3);
    System.out.println(c2.getBlue());
    System.out.println(c3.toString());
    // método fábrica (factory method)
  }
}

public class Cor {
  private int red, green, blue;

  private Cor(int r, int g, int b) {
    this.red = r;
    this.green = g;
    this.blue = b;
  }

  static Cor rgb(int red, int green, int blue) {
    return new Cor(red, green, blue);
  }

  static Cor string (String str) {
    String[] split = str.split(" ");
    int r = Integer.parseInt(split[0]);
    int g = Integer.parseInt(split[1]);
    int b = Integer.parseInt(split[2]);
    return rgb(r, g, b);
  }
  int getRed() {
    return red;
  }
  int getGreen() {
    return green;
  }
  int getBlue() {
    return blue;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Cor) {
      Cor other = (Cor) obj;
      return this.red == other.getRed() && this.green == other.getGreen() && this.blue == other.getBlue();
    }
    return false;
  }

  public static Cor hsl(int i, double d, double e) {
    return null;
  }

  @Override
  public String toString() {
      // TODO Auto-generated method stub
      return String.format("rgb(%s, %s, %s)",red, green, blue);
  }
  
}

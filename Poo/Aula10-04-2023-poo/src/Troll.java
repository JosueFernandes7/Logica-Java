public class Troll {
  public static String disemvowel(String str) {
    String[] vowels = { "a", "e", "i", "o", "u" };
    String endString = "";
  
    for (int i = 0; i < str.length(); i++) {
      for(int j = 0; j < vowels.length; j++) {
        String letra = String.valueOf(str.charAt(i));
        if(letra.toLowerCase().equals(vowels[j])) break;
        
        if(j == vowels.length - 1) {
          endString += str.charAt(i);
        }
      }
    }

    return endString;
  }
}
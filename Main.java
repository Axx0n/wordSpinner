public class Main{

  public static void main(String[] args) {
    String toSpin = "This will spin words longer than or four charachters";
    String spun = spinWords(toSpin);
    System.out.println(spun);
  }

  public static String spinWords(String sentence) {
    String[] split = sentence.split(" ");
    String finalReturn = "";
      for(String str : split) {
        if(str.length() >= 5) {
          String helper = "";
          for(int i = 0; i < str.length(); i++) {
            helper += str.charAt(str.length() - i - 1);
          }
            finalReturn += helper + " ";
          } else {
            finalReturn += str + " ";
          }
        }
      finalReturn = finalReturn.substring(0, finalReturn.length() -1);
      return finalReturn;
    }
    
}

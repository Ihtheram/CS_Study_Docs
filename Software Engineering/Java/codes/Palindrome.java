import static java.lang.System.out;

public class Palindrome {
    public static void main(String[] args) {
      String str = "madam";
      String rev = "";
      
      for (int i = str.length() - 1; i >= 0; i--) {
        rev += str.charAt(i);
      }
      
      if (str.equals(rev)) {
        out.println(str + " is a palindrome");
      } else {
        out.println(str + " is not a palindrome");
      }
    }
  }
  
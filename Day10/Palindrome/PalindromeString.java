package Palindrome;


public class PalindromeString {

  public boolean isIt(String s) {
    if (s.length() <= 1) {
      return true;
    }
    return s.charAt(0) == s.charAt(s.length() - 1) && isIt(s.substring(1, s.length() - 1));
  }
}

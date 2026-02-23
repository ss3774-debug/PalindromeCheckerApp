public class PalindromeCheckerApp {

   
    public static void checkPalindromeStringReverse(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equals(reversed)) {
            System.out.println("UC3 Result: '" + word + "' is a palindrome!");
        } else {
            System.out.println("UC3 Result: '" + word + "' is NOT a palindrome.");
        }
    }
  
}

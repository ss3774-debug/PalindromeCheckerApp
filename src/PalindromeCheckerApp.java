public class PalindromeCheckerApp {


    // UC2: Hardcoded Palindrome
    public static void checkHardcodedPalindrome() {
        String word = "radar"; // hardcoded palindrome
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("UC2 Result: '" + word + "' is a palindrome!");
        } else {
            System.out.println("UC2 Result: '" + word + "' is NOT a palindrome.");
        }
    }
   

}

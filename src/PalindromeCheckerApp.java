public class PalindromeCheckerApp {

    public static void main(String[] args) {
        displayWelcomeMessage();
    }

    // UC1: Welcome Message Module
    public static void displayWelcomeMessage() {
        System.out.println("====================================");
        System.out.println("   Welcome to Palindrome Checker   ");
        System.out.println("====================================");
    }
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
    public static void checkPalindromeStringReverse(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equals(reversed)) {
            System.out.println("UC3 Result: '" + word + "' is a palindrome!");
        } else {
            System.out.println("UC3 Result: '" + word + "' is NOT a palindrome.");
        }
    }
}
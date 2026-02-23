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
    public static void checkPalindromeCharArray(String word) {
        char[] arr = word.toCharArray();
        boolean isPalindrome = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC4 Result: '" + word + "' is a palindrome!");
        } else {
            System.out.println("UC4 Result: '" + word + "' is NOT a palindrome.");
        }
    }
    import java.util.Stack;

    public static void checkPalindromeStack(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (word.equals(reversed)) {
            System.out.println("UC5 Result: '" + word + "' is a palindrome!");
        } else {
            System.out.println("UC5 Result: '" + word + "' is NOT a palindrome.");
        }
    }
}
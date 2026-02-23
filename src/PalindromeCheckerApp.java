public class PalindromeCheckerApp {

   
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

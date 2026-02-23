public class PalindromeCheckerApp {

  
    import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

    public static void checkPalindromeQueueStack(String word) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC6 Result: '" + word + "' is a palindrome!");
        } else {
            System.out.println("UC6 Result: '" + word + "' is NOT a palindrome.");
        }
    }
}

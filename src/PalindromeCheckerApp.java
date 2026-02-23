public class PalindromeCheckerApp {


    import java.util.ArrayDeque;
    import java.util.Deque;

    public static void checkPalindromeDeque(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : word.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC7 Result: '" + word + "' is a palindrome!");
        } else {
            System.out.println("UC7 Result: '" + word + "' is NOT a palindrome.");
        }
    }
}

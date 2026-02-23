public class PalindromeCheckerApp {

  
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
}

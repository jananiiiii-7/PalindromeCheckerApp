public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("=======================================");

        String input = "madam";

        char[] charArray = input.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input String : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);

    }
}
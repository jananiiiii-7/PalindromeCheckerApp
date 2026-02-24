public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("=======================================");

        String input = "madam";

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            reversed = reversed + input.charAt(i);

        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input String : " + input);
        System.out.println("Reversed String : " + reversed);
        System.out.println("Is Palindrome : " + isPalindrome);

    }
}
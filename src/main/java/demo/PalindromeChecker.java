/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

public class PalindromeChecker {

    public boolean checkPalindrome(String original) {
        return equalStrings(original, original);  //Ctrl+Alt+N or Option+Command+N to Inline!
    }

    /**
     * Reverses the input string.
     * @param original The original String to be reversed
     * @return The reversed String
     */
    public String reverseString(String original) {
        return "";
    }

    /**
     * Compare two string if they are the same, if they are empty return false, empty string can't be a palindrome.
     * @param original String from user input
     * @param reverse String after reversal
     * @return true if original and reverse are equal and not empty.
     */
    public boolean equalStrings(String original, String reverse) {
        return original.equals(reverse);
    }
}

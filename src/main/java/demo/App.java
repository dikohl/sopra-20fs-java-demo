/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();
        if (!checker.checkPalindrome(in.nextLine())) {
            System.out.println("It really is a palindrome");
        } else {
            System.out.println("It is not a palindrome, sorry!");
        }
    }
}

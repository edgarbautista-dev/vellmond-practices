package ejercicios;

import java.util.Scanner;

public class palindromo {

    public static void main(String[] args) {
        System.out.println("teclea una letra");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
       // String word = "anitalavalatina";
        boolean isPalindrome = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The word "+word+" is a palindrome");
        } else {
            System.out.println("The word "+word+" is not a palindrome");
        }
    }
}

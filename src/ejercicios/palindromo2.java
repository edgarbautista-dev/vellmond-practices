package ejercicios;

public class palindromo2 {
    public static void main(String[] args) {
        String word = "anitalavalatina";
        boolean isPalindrome = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }
    }
}

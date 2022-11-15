package ejercicios;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String word1 = "anagram";
        String word2 = "nagaram";
        boolean isAnagram = true;
        if (word1.length() != word2.length()) {
            isAnagram = false;
        } else {
            char[] word1Array = word1.toCharArray();
            char[] word2Array = word2.toCharArray();
            Arrays.sort(word1Array);
            Arrays.sort(word2Array);
            isAnagram = Arrays.equals(word1Array, word2Array);
        }
        if (isAnagram) {
            System.out.println("The words are anagrams");
        } else {
            System.out.println("The words are not anagrams");
        }
    }
}

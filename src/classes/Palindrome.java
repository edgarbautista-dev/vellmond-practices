package classes;

public class Palindrome {

    public static boolean isPalindrome(String word){
        if(word.length()<=1){
            return true;
        }else if(word.charAt(0)==word.charAt(word.length()-1)){
            return isPalindrome(word.substring(1,word.length()-1));
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        String[] words={"coco","pedro","lool","abcdcba","abcdbca"};
        for(String word: words){
            System.out.println(word+" is palindrome?"+isPalindrome(word));
        }

    }
}

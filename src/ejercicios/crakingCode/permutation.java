package ejercicios.crakingCode;


/**
 *  check Permutation
 *  Given two strings, write a method to decide if one is a permutation of the other
 */
public class permutation {

    public static String sort(String word){
        char[] contains= word.toCharArray();
        java.util.Arrays.sort(contains);
        return new String(contains);
    }

    public static boolean permutation(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args){
        String[][] pairs = {{"hello","llohe"},{"coco","occo"},{"pera","opo"}};
        for (String[] pair:pairs){
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1,word2);
            System.out.println(word1+" & "+word2+" is permutation? = "+anagram);
        }
    }
}

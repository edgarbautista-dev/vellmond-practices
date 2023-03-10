package ejercicios.crakingCode;

public class permutationB {

    public static boolean permutation(String s, String t){
        if(s.length()!=t.length()){return false; }

        int[] letters = new int[128];
        for(int i=0;i<s.length();i++){
            letters[s.charAt(i)]++;
        }

        for (int j=0;j<t.length();j++){
            letters[t.charAt(j)]--;
            if(letters[t.charAt(j)]<0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        String[][] pairs = {{"hola","aloh"},{"coca","caco"},{"pedro","drop"}};
        for(String[] pair : pairs){
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1,word2);
            System.out.println(word1+" & "+word2+" is permutation = "+anagram);
        }
    }
}

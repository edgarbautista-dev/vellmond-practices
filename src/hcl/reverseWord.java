package hcl;

public class reverseWord {
    public static void main(String[] args){
        String[] words={"jose","pedro","lool","abcdcba","abcdbca"};
        for(String word: words){
            System.out.println("The word "+word+" is "+reverse(word)+" reversed");
        }
    }

    public static String reverse(String word){
        String reversedWord="";
        for(int i=word.length()-1;i>=0;i--){
            reversedWord+=word.charAt(i);
        }
        return reversedWord;
    }

    //Reverse con StringBuilder
    //es mas eficiente que el anterior ya que no crea un nuevo objeto en cada iteracion
    public static String reverseStringBuilder(String word){
        StringBuilder reversedWord= new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }
}

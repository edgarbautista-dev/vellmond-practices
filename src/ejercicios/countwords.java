package ejercicios;
/*
    *  count duplicated words in a text
    *
 */
public class countwords {
    public static void main(String[] args) {
        String text = "This is a text with some words and some words repeated";
        String[] words = text.split("");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            System.out.println(words[i] + " " + count);
            count = 0;
        }
    }
}

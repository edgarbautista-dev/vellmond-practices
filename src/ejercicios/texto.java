package ejercicios;
/*
 * Contar el numero de veces que se repite cada letra en un texto
 * */
public class texto {
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
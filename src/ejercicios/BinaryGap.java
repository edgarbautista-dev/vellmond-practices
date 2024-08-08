package ejercicios;

/*
    * Una brecha binaria dentro de un entero positivo N es cualquier secuencia máxima de ceros consecutivos que está rodeada por unos en ambos extremos en la representación binaria de N.
    * Por ejemplo, el número 9 tiene representación binaria 1001 y contiene una brecha binaria de longitud 2.
    * El número 529 tiene representación binaria 1000010001 y contiene dos brechas binarias: una de longitud 4 y una de longitud 3.
    * El número 20 tiene representación binaria 10100 y contiene una brecha binaria de longitud 1.
    * El número 15 tiene representación binaria 1111 y no tiene brechas binarias.
    * El número 32 tiene representación binaria 100000 y no tiene brechas binarias.
    * Escriba una función:
    * class Solution {public int solution (int N); }
    * que, dado un número entero positivo N, devuelve la longitud de su brecha binaria más larga.
    * La función debe devolver 0 si N no contiene una brecha binaria.
    * Por ejemplo, dado N = 1041, la función debe devolver 5, porque N tiene representación binaria 10000010001 y, por lo tanto, su brecha binaria más larga tiene longitud 5.
    * Dado N = 32, la función debe devolver 0, porque N tiene representación binaria '100000' y, por lo tanto, no contiene brechas binarias.
    * Escriba un algoritmo eficiente para las siguientes suposiciones:
    * N es un número entero dentro del rango [1..2,147,483,647].
    * Complejidad esperada:
    * tiempo de ejecución es O (longitud (N));
    * se espera que el rendimiento espacial sea O (1).
    * 
 */
public class BinaryGap {
    public int solution(int N) {

        String binary = Integer.toBinaryString(N);
        int maxGap = 0;
        int currentGap = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                currentGap++;
            } else {
                if (currentGap > maxGap) {
                    maxGap = currentGap;
                }
                currentGap = 0;
            }
        }
        return maxGap;
    }

    public static void main(String[] args){
        BinaryGap bg = new BinaryGap();
        System.out.println(bg.solution(1041));
        System.out.println(bg.solution(32));
        System.out.println(bg.solution(15));
        System.out.println(bg.solution(9));
        System.out.println(bg.solution(529));
        System.out.println(bg.solution(20));
    }
}

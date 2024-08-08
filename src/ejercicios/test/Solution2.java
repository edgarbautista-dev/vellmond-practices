package ejercicios.test;

import java.util.Arrays;

public class Solution2 {
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] solution(int N) {
        // Verificar si N es primo
        if (isPrime(N)) {
            int[] result = new int[N];
            for (int i = 0; i < N / 2; i++) {
                result[i] = i + 1;
                result[N / 2 + i] = -(i + 1);
            }
            return result;
        } else {
            // Si N no es primo, seguir la lógica anterior
            int[] result = new int[N];
            for (int i = 0; i < N / 2; i++) {
                result[i] = i + 1;
            }
            for (int i = N / 2; i < N; i++) {
                result[i] = -(i - N / 2 + 1);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        // Ejemplo con N = 4 (N no es primo)
        int[] result = solution.solution(4);
        System.out.println(Arrays.toString(result));

        // Ejemplo con N = 3 (N es primo)
        result = solution.solution(3);
        System.out.println(Arrays.toString(result));
    }
}

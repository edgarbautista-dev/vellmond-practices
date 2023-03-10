package classes;

/**
 * Usa programación dinámica para resolver el siguiente problema de la mochila.
 * Suponga una capacidad máxima de 140 unidades.
 * ¿Cuál es el valor óptimo de la mochila?,
 * ¿Cuáles son los objetos que debemos tomar?
 */
public class ProgramacionDinamica {
    public static void main(String[] args) {
        int[] pesos = {85, 26, 48, 21, 22, 95, 43, 45, 55, 52};
        int[] valores = {79, 32, 47, 18, 26, 85, 33, 40, 45, 59};
        int capacidad = 140;
        int[][] tabla = new int[pesos.length + 1][capacidad + 1];
        for (int i = 0; i <= pesos.length; i++) {
            for (int j = 0; j <= capacidad; j++) {
                if (i == 0 || j == 0) {
                    tabla[i][j] = 0;
                } else if (pesos[i - 1] <= j) {
                    tabla[i][j] = Math.max(valores[i - 1] + tabla[i - 1][j - pesos[i - 1]], tabla[i - 1][j]);
                } else {
                    tabla[i][j] = tabla[i - 1][j];
                }
            }
        }
        System.out.println("Valor maximo: " + tabla[pesos.length][capacidad]);
        int res = tabla[pesos.length][capacidad];
        int w = capacidad;
        for (int i = pesos.length; i > 0 && res > 0; i--) {
            if (res == tabla[i - 1][w]) {
                continue;
            } else {
                System.out.println("Peso: " + pesos[i - 1] + " Valor: " + valores[i - 1]);
                res = res - valores[i - 1];
                w = w - pesos[i - 1];
            }
        }
    }
}

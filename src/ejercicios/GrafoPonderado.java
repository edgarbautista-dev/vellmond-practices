package ejercicios;

/*
 *. Codifica el algoritmo de Dijkstra.
 * En el archivo “Grafo_ponderado.txt”, encontraras la descripción de un dígrafo.
 *  Usa el algoritmo que codificaste, para encontrar la ruta mínima del nodo 0 al nodo 14.
 *  Reporta tu resultado y tu código. Anexo imagen del grafo en cuestión.  count duplicated words in a text
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class GrafoPonderado {
    public static void main(String[] args) {
        int[][] aristas = {
                {0, 5, 1},
                {0, 7, 9},
                {0, 11, 11},
                {0, 16, 11},
                {0, 17, 3},
                {0, 18, 9},
                {1, 5, 5},
                {1, 7, 1},
                {1, 9, 10},
                {1, 15, 1},
                {1, 16, 6},
                {1, 19, 12},
                {2, 12, 14},
                {2, 16, 4},
                {2, 19, 13},
                {3, 7, 5},
                {3, 15, 1},
                {3, 16, 10},
                {3, 18, 4},
                {4, 7, 3},
                {4, 8, 11},
                {4, 11, 12},
                {4, 13, 13},
                {4, 16, 9},
                {4, 18, 8},
                {5, 7, 2},
                {5, 8, 2},
                {5, 9, 13},
                {5, 11, 1},
                {5, 14, 12},
                {6, 7, 8},
                {6, 10, 6},
                {6, 13, 13},
                {6, 15, 5},
                {6, 18, 13},
                {7, 8, 2},
                {7, 11, 13},
                {7, 16, 4},
                {7, 17, 6},
                {7, 19, 7},
                {8, 13, 8},
                {8, 14, 10},
                {8, 16, 14},
                {9, 16, 9},
                {10, 17, 7},
                {10, 19, 5},
                {11, 13, 12},
                {11, 14, 13},
                {11, 15, 2}
        };
        int[] nodos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        System.out.println("Que nodos quieres?");
        System.out.println("Nodo inicial: ");
        Scanner sc = new Scanner(System.in);
        int nodoInicial = sc.nextInt();
        System.out.println("Nodo final: ");
        int nodoFinal = sc.nextInt();
        Djsktra(nodos, aristas, nodoInicial, nodoFinal);

    }


    private static void Djsktra(int[] nodos, int[][] aristas, int i, int i1) {
        int[] distancias = new int[aristas.length];
        int[] anteriores = new int[aristas.length];
        int[] visitados = new int[aristas.length];
        Arrays.fill(distancias, Integer.MAX_VALUE);
        Arrays.fill(anteriores, -1);
        Arrays.fill(visitados, 0);
        distancias[i] = 0;
        int nodoActual = i;
        while (nodoActual != i1) {
            for (int[] arista : aristas) {
                if (arista[0] == nodoActual) {
                    if (distancias[arista[1]] > distancias[nodoActual] + arista[2]) {
                        distancias[arista[1]] = distancias[nodoActual] + arista[2];
                        anteriores[arista[1]] = nodoActual;
                    }
                }
            }
            visitados[nodoActual] = 1;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < distancias.length; j++) {
                if (distancias[j] < min && visitados[j] == 0) {
                    min = distancias[j];
                    nodoActual = j;
                }
            }
        }
        System.out.println("Distancias: " + Arrays.toString(distancias));
        System.out.println("Anteriores: " + Arrays.toString(anteriores));
        System.out.println("Visitados: " + Arrays.toString(visitados));
        System.out.println("Ruta: ");
        int nodo = i1;
        while (nodo != i) {
            System.out.println(nodo);
            nodo = anteriores[nodo];
        }
        System.out.println(i);
    }

}


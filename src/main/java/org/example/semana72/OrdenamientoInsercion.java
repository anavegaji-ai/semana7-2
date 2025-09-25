package org.example.semana72;

/**
 * Implementa el algoritmo de ordenamiento por inserción.
 */
public class OrdenamientoInsercion {
    /**
     * Ordena el arreglo usando el método de inserción.
     * @param arr Arreglo de enteros a ordenar
     */
    public static void ordenar(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}


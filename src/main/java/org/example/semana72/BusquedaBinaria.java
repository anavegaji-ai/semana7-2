package org.example.semana72;

/**
 * Implementa el algoritmo de búsqueda binaria.
 */
public class BusquedaBinaria {
    /**
     * Busca un número en el arreglo ordenado usando búsqueda binaria.
     * @param arr Arreglo de enteros ordenado
     * @param objetivo Número a buscar
     * @return ResultadoBusqueda con si se encontró y número de comparaciones
     */
    public static ResultadoBusqueda buscar(int[] arr, int objetivo) {
        int comparaciones = 0;
        int izquierda = 0;
        int derecha = arr.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            comparaciones++;
            if (arr[medio] == objetivo) {
                return new ResultadoBusqueda(true, comparaciones);
            } else if (arr[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return new ResultadoBusqueda(false, comparaciones);
    }
}


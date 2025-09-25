package org.example.semana72;

/**
 * Implementa el algoritmo de búsqueda lineal.
 */
public class BusquedaLineal {
    /**
     * Busca un número en el arreglo usando búsqueda lineal.
     * @param arr Arreglo de enteros
     * @param objetivo Número a buscar
     * @return ResultadoBusqueda con si se encontró y número de comparaciones
     */
    public static ResultadoBusqueda buscar(int[] arr, int objetivo) {
        int comparaciones = 0;
        for (int num : arr) {
            comparaciones++;
            if (num == objetivo) {
                return new ResultadoBusqueda(true, comparaciones);
            }
        }
        return new ResultadoBusqueda(false, comparaciones);
    }
}


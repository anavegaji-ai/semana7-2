package org.example.semana72;

/**
 * Encapsula el resultado de una búsqueda.
 */
public class ResultadoBusqueda {
    public final boolean encontrado;
    public final int comparaciones;

    public ResultadoBusqueda(boolean encontrado, int comparaciones) {
        this.encontrado = encontrado;
        this.comparaciones = comparaciones;
    }
}


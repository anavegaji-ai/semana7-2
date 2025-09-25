package org.example.semana72;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

@SpringBootApplication
public class Semana72Application {

    public static void main(String[] args) {
        // 1. Generar un arreglo de 20 números enteros aleatorios entre 1 y 100
        int[] arreglo = new int[20];
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(100) + 1;
        }

        // 2. Imprimir el arreglo original
        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arreglo));

        // 3. Ordenar el arreglo usando inserción y mostrarlo ordenado
        OrdenamientoInsercion.ordenar(arreglo);
        System.out.println("Arreglo ordenado (Inserción):");
        System.out.println(Arrays.toString(arreglo));

        // 4. Pedir al usuario un número a buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número a buscar (1-100): ");
        int objetivo = scanner.nextInt();

        // 5. Implementar búsqueda lineal
        ResultadoBusqueda resultadoLineal = BusquedaLineal.buscar(arreglo, objetivo);
        System.out.println("\nBúsqueda Lineal:");
        System.out.println("¿Encontrado?: " + resultadoLineal.encontrado);
        System.out.println("Comparaciones realizadas: " + resultadoLineal.comparaciones);

        // 5. Implementar búsqueda binaria
        ResultadoBusqueda resultadoBinaria = BusquedaBinaria.buscar(arreglo, objetivo);
        System.out.println("\nBúsqueda Binaria:");
        System.out.println("¿Encontrado?: " + resultadoBinaria.encontrado);
        System.out.println("Comparaciones realizadas: " + resultadoBinaria.comparaciones);

        // 6. Comparar resultados
        System.out.println("\nComparación de métodos:");
        if (resultadoLineal.encontrado == resultadoBinaria.encontrado) {
            System.out.println("Ambos métodos coinciden en el resultado de búsqueda.");
        } else {
            System.out.println("Los métodos difieren en el resultado de búsqueda.");
        }
        System.out.println("Lineal: " + resultadoLineal.comparaciones + " comparaciones, Binaria: " + resultadoBinaria.comparaciones + " comparaciones.");
    }

}

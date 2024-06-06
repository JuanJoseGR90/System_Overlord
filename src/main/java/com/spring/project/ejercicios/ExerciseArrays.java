package com.spring.project.ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ExerciseArrays {

    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();

    /**
     * Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y otro para mostrar.
     */
    public static int[] arrayInt() {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("-> Introduce 10 valores de tipo entero: ");

            arr[i] = sc.nextInt();
        }
        return arr;
    }


    public static int[] mostrarArrayInt(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    /**
     * Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición y la suma de todos los valores. Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar), para mostrar el contenido y la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).
     */
    public static int arrayNumeros() {

        int sumaValores = 0;

        System.out.println("Introduce el tamaño del array: ");

        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(0, 9);

            sumaValores = arr[i] + sumaValores;

            System.out.println(arr[i]);
        }

        return sumaValores;
    }

    /**
     * Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos entre los números deseados, por último nos indica cual es el mayor de todos.
     * <p>
     * Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo métodos que necesites.
     */
    public static void comprobarNumerosPrimos () {

        System.out.println("Introduce el tamaño del array: ");

        int[] arrayPrimos = new int[sc.nextInt()];

        for (int i = 0; i < arrayPrimos.length; i++) {

            int primo = random.nextInt(0, 100);

            if ((primo % 1 == 0) && (primo % primo == 0)) {

                arrayPrimos[i] = primo;

                System.out.println(arrayPrimos[i]);
            }
        }
        System.out.println(Arrays.stream(arrayPrimos).max());
    }

    /**
     * Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media*/
    public static void obtenerMedia () {

        int obtenerMedia = 0;

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;

            obtenerMedia = arr[i] + obtenerMedia;

            System.out.println(arr[i]);
        }

        obtenerMedia = obtenerMedia / 2;

        System.out.println(obtenerMedia);
    }

    public static void main(String[] args) {

//        ExerciseArrays.mostrarArrayInt(ExerciseArrays.arrayInt());

//        System.out.println(ExerciseArrays.arrayNumeros());

//        ExerciseArrays.comprobarNumerosPrimos();

//        obtenerMedia();

    }
}
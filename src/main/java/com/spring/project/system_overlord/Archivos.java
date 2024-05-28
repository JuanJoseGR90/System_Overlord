package com.spring.project.system_overlord;

import java.io.*;
import java.util.Scanner;

public class Archivos {

    static {
        System.out.println("\n>> Inicio de ejecución: ");
    }

    private static String archivo = "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\leeme.txt";
    private static String carpeta = "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\carpeta";
    private static String directorio = "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\dir1\\dir2\\dir3";
    static String[] directorios = {
            "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\dir1",
            "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\dir1\\dir2",
            "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\dir1\\dir2\\dir3"};

    /**
     * Variables para modificar formato
     */
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";

    /**
     * Crea un archivo; si el archivo ya existe muestra un mensaje por pantalla, y si no lo crea.
     *
     * @param file ruta donde se crea el archivo
     * @throws IOException si no se ha podido crear el archivo
     */
    public void crearArchivo(String file) throws IOException {

        File crearArchivo = new File(file);

        if (crearArchivo.exists()) {
            System.out.println("El archivo ya existe");
        } else {
            crearArchivo.createNewFile();
            System.out.println("El archivo ha sido creado");
        }

    }

    /**
     * Crea una carpeta dentro de un directorio; si la carpeta existe muestra un mensaje por pantalla y si no existe la crea y muestra un mensaje por pantalla.
     *
     * @param dir ruta del directorio
     * @throws IOException lanza una excepción si no se ha podido crear la carpeta.
     */
    public void crearCarpeta(String dir) throws IOException {

        File crearArchivo = new File(dir);

        if (crearArchivo.exists()) {
            System.out.println("El archivo ya existe");
        } else {
            crearArchivo.mkdir();
            System.out.println("La carpeta ha sido creada");
        }
    }

    /**
     * Crea un directorio, y los subsiguientes directorios.
     *
     * @param dirs recibe la ruta de un directorio, o un directorio y varios subdirectorios.
     * @throws IOException lanza una excepción si no se ha podido crear el directorio.
     */
    public void crearDirectorios(String dirs) throws IOException {
        File dir = new File(dirs);

        dir.mkdirs();
    }

    /**
     * Elimina un directorio
     *
     * @param dir recibe tipo String con la ruta.
     * @throws IOException lanza una excepción si no se ha podido eliminar.
     */
    public void eliminarDirectorio(String dir) throws IOException {
        File file = new File(dir);

        file.delete();
    }

    public void eliminarArchivo() {

        File eliminar = new File(archivo);

        if (eliminar.exists()) {
            eliminar.delete();
            System.out.println("El archivo ha sido eliminado");
        } else {
            System.out.println("El archivo no existe");
        }
    }

    public void eliminarCarpeta() {

        File eliminar = new File(carpeta);

        if (eliminar.exists()) {
            eliminar.delete();
            System.out.println("La carpeta ha sido eliminada");
        } else {
            System.out.println("La carpeta no existe");
        }
    }

    public void escribirArchivo() throws IOException {

        System.out.println("\nAñade la información aquí: ");

        FileWriter escribir = new FileWriter(archivo);
        Scanner sc = new Scanner(System.in);

        String info = sc.nextLine();

        escribir.write(info);

        escribir.close();
    }

    public void leerArchivo() throws IOException {

        try (FileReader leer = new FileReader(archivo); BufferedReader br = new BufferedReader(leer)) {
            StringBuilder contenido = new StringBuilder();

            String info;

            while ((info = br.readLine()) != null) {
                contenido.append(info).append("\n");
            }
            System.out.println(ANSI_GREEN + contenido + ANSI_RESET);
        }

    }

    public void eliminarDirectorios() {

        for (int i = directorios.length - 1; i >= 0; i--) {

            String dir = directorios[i];

            File directorio = new File(dir);

            directorio.delete();

        }
    }

    public static void main(String[] args) throws IOException {

        Archivos pruebas = new Archivos();


    }
}

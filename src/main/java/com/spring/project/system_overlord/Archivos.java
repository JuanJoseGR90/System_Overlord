package com.spring.project.system_overlord;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;

public class Archivos {

    static {
        System.out.println("\n>> Inicio de ejecución: ");
    }

    private static final String ARCHIVO = "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\testfile.txt";
    private static final String CARPETA = "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\test";
    //    private static final String DIRECTORIO = "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\dir1\\dir2\\dir3";
    static final String[] DIRECTORIOS = {
            "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\dir1",
            "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\dir1\\dir2",
            "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\dir1\\dir2\\dir3"};

    /**
     * Variables para modificar formato
     */
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";

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
        } else if (crearArchivo.createNewFile()) {
            System.out.println("El archivo ha sido creado");
        }
    }

    /**
     * Crea una carpeta dentro de un directorio; si la carpeta existe muestra un mensaje por pantalla y si no existe la crea y muestra un mensaje por pantalla.
     *
     * @param dir ruta del directorio
     */
    public void crearCarpeta(String dir) {

        File crearArchivo = new File(dir);

        if (crearArchivo.exists()) {
            System.out.println("El archivo ya existe");
        } else if (crearArchivo.mkdir()) {
            System.out.println("La carpeta ha sido creada");
        }
    }

    /**
     * Crea un directorio, y los subsiguientes directorios.
     *
     * @param dirs recibe la ruta de un directorio, o un directorio y varios subdirectorios.
     */
    public void crearDirectorios(String dirs) {
        File dir = new File(dirs);

        if (dir.mkdirs()) {
            System.out.println("El archivo ha sido creado");
        } else {
            System.out.println("El archivo no ha podido crearse");
        }

    }

    /**
     * Elimina un directorio
     *
     * @param dir recibe tipo String con la ruta.
     */
    public void eliminarDirectorio(String dir) {
        File file = new File(dir);

        if (file.delete()) {
            System.out.println("El archivo ha sido eliminado");
        } else {
            System.out.println("El archivo no se ha podido eliminar");
        }
    }

    public void eliminarArchivo(String dir) {

        File eliminar = new File(dir);

        if (eliminar.delete()) {
            System.out.println("El archivo ha sido eliminado");
        } else {
            System.out.println("El archivo no existe");
        }
    }

    public void eliminarCarpeta(String dir) {

        File eliminar = new File(dir);

        if (eliminar.delete()) {
            System.out.println("La carpeta ha sido eliminada");
        } else {
            System.out.println("La carpeta no existe");
        }
    }

    public void escribirArchivo(String dir) throws IOException {

        System.out.println("\nAñade la información aquí: ");

        Path filePath = Paths.get(dir);
        if (!Files.exists(filePath)) {
            // Define los permisos que deseas establecer
            FileAttribute<?> permissions = PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-r--r--"));

            // Crea el archivo con los permisos especificados
            Files.createFile(filePath, permissions);
        }

        FileWriter escribir = new FileWriter(dir);

        String info = "Datos, datos";

        escribir.write(info);
        escribir.close();
    }

    public void leerArchivo(String dir) throws IOException {

        try (FileReader leer = new FileReader(dir); BufferedReader br = new BufferedReader(leer)) {
            StringBuilder contenido = new StringBuilder();

            String info;

            while ((info = br.readLine()) != null) {
                contenido.append(info).append("\n");
            }
            System.out.println(ANSI_GREEN + contenido + ANSI_RESET);
        }

    }

    public void eliminarDirectorios(String dir) throws SecurityException {

        for (int i = DIRECTORIOS.length - 1; i >= 0; i--) {

            dir = DIRECTORIOS[i];

            File directorio = new File(dir);

            if (directorio.delete()) {
                System.out.println("Directorio eliminado");
            } else {
                System.out.println("El directorio no ha podido eliminarse");
            }
        }
    }

    public static void main(String[] args) {

    }
}

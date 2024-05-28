package com.spring.project.system_overlord;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class ArchivosTests {

    private Archivos archivos;
    private final String TEST_FILE_PATH = "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\testfile.txt";
    private final String TEST_DIR_PATH = "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\test";

    @Before
    public void setUp() {
        archivos = new Archivos();
    }

    @After
    public void tearDown() {
        File file = new File(TEST_FILE_PATH);
        if (file.delete()) {
            System.out.println("Archivo eliminado");
        } else {
            System.out.println("Archivo no eliminado");
        }

        File dir = new File(TEST_DIR_PATH);
        if (dir.delete()) {
            System.out.println("Directorio eliminado");
        } else {
            System.out.println("Directorio no eliminado");
        }
    }

    @Test
    public void testCrearArchivo() throws IOException {
        archivos.crearArchivo(TEST_FILE_PATH);
        File file = new File(TEST_FILE_PATH);
        assertTrue(file.exists());
    }

    @Test
    public void testCrearCarpeta() {
        archivos.crearCarpeta(TEST_DIR_PATH);
        File dir = new File(TEST_DIR_PATH);
        assertTrue(dir.exists() && dir.isDirectory());
    }

    @Test
    public void testEliminarArchivo() throws IOException {
        File file = new File(TEST_FILE_PATH);

        if (file.createNewFile()) {
            System.out.println("Archivo creado");
        } else {
            System.out.println("Archivo no creado");
        }

        archivos.eliminarArchivo();
        assertFalse(file.exists());
    }

    @Test
    public void testEliminarCarpeta() {
        File dir = new File(TEST_DIR_PATH);

        if (dir.mkdir()) {
            System.out.println("Directorio eliminado");
        } else {
            System.out.println("Directorio no eliminado");
        }

        archivos.eliminarCarpeta();
        assertFalse(dir.exists());
    }

    @Test
    public void testCrearDirectorios() {
        String dirs = "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\testdir\\subdir1\\subdir2";
        archivos.crearDirectorios(dirs);
        File dir = new File(dirs);
        assertTrue(dir.exists() && dir.isDirectory());
        // Cleanup
        if (dir.delete()) {
            System.out.println("Directorio eliminado");
        } else {
            System.out.println("Directorio no eliminado");
        }

        if (new File(
                "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\testdir\\subdir1").delete()
                &&
                new File("C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\testdir").delete()) {
            System.out.println("Directorio eliminado");
        } else {
            System.out.println("Directorio no eliminado");
        }
    }

    @Test
    public void testEliminarDirectorio() {
        File dir = new File(TEST_DIR_PATH);

        if (dir.mkdirs()) {
            System.out.println("Directorio eliminado");
        } else {
            System.out.println("Directorio no eliminado");
        }

        archivos.eliminarDirectorio(TEST_DIR_PATH);
        assertFalse(dir.exists());
    }

    @Test
    public void testEscribirYLeerArchivo() throws IOException {
        archivos.crearArchivo(TEST_FILE_PATH);
        archivos.escribirArchivo();
        File file = new File(TEST_FILE_PATH);
        assertTrue(file.exists());

        archivos.leerArchivo();
    }

    @Test
    public void testEliminarDirectorios() {
        for (String dir : Archivos.DIRECTORIOS) {
            if (new File(dir).mkdirs()) {
                System.out.println("Directorios eliminados");
            } else {
                System.out.println("Directorios no eliminados");
            }
        }
        archivos.eliminarDirectorios();
        for (String dir : Archivos.DIRECTORIOS) {
            File directory = new File(dir);
            assertFalse(directory.exists());
        }
    }
}
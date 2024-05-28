package com.spring.project.system_overlord;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class ArchivosTests {

    private Archivos archivos;
    private String testFilePath = "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\testfile.txt";
    private String testDirPath = "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\testdir";

    @Before
    public void setUp() {
        archivos = new Archivos();
    }

    @After
    public void tearDown() {
        File file = new File(testFilePath);
        if (file.exists()) {
            file.delete();
        }

        File dir = new File(testDirPath);
        if (dir.exists()) {
            dir.delete();
        }
    }

    @Test
    public void testCrearArchivo() throws IOException {
        archivos.crearArchivo(testFilePath);
        File file = new File(testFilePath);
        assertTrue(file.exists());
    }

    @Test
    public void testCrearCarpeta() throws IOException {
        archivos.crearCarpeta(testDirPath);
        File dir = new File(testDirPath);
        assertTrue(dir.exists() && dir.isDirectory());
    }

    @Test
    public void testEliminarArchivo() throws IOException {
        File file = new File(testFilePath);
        file.createNewFile();
        archivos.eliminarArchivo();
        assertFalse(file.exists());
    }

    @Test
    public void testEliminarCarpeta() {
        File dir = new File(testDirPath);
        dir.mkdir();
        archivos.eliminarCarpeta();
        assertFalse(dir.exists());
    }

    @Test
    public void testCrearDirectorios() throws IOException {
        String dirs = "C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\testdir\\subdir1\\subdir2";
        archivos.crearDirectorios(dirs);
        File dir = new File(dirs);
        assertTrue(dir.exists() && dir.isDirectory());
        // Cleanup
        dir.delete();
        new File("C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\testdir\\subdir1").delete();
        new File("C:\\Users\\Hellrider\\Desktop\\Nueva carpeta\\testdir").delete();
    }

    @Test
    public void testEliminarDirectorio() throws IOException {
        File dir = new File(testDirPath);
        dir.mkdirs();
        archivos.eliminarDirectorio(testDirPath);
        assertFalse(dir.exists());
    }

    @Test
    public void testEscribirYLeerArchivo() throws IOException {
        archivos.crearArchivo(testFilePath);
        archivos.escribirArchivo();
        File file = new File(testFilePath);
        assertTrue(file.exists());

        archivos.leerArchivo();
    }

    @Test
    public void testEliminarDirectorios() {
        for (String dir : Archivos.directorios) {
            new File(dir).mkdirs();
        }
        archivos.eliminarDirectorios();
        for (String dir : Archivos.directorios) {
            File directory = new File(dir);
            assertFalse(directory.exists());
        }
    }
}
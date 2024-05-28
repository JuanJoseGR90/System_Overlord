package com.spring.project.threads;

import com.spring.project.system_overlord.Archivos;
import javafx.concurrent.Task;

public class ArchivoTask extends Task<Void> {

    private Archivos archivos;
    private String operation;
    private String path;

    public ArchivoTask(Archivos archivos, String operation, String path) {
        this.archivos = archivos;
        this.operation = operation;
        this.path = path;
    }

    @Override
    protected Void call() throws Exception {
        switch (operation) {
            case "crearArchivo":
                archivos.crearArchivo(path);
                updateMessage("Archivo creado: " + path);
                break;
            case "eliminarArchivo":
                archivos.eliminarArchivo(path);
                updateMessage("Archivo eliminado" + path);
                break;
            case "crearCarpeta":
                archivos.crearCarpeta(path);
                updateMessage("Carpeta creada: " + path);
                break;
            case "eliminarCarpeta":
                archivos.eliminarCarpeta(path);
                updateMessage("Carpeta eliminada");
                break;
            case "crearDirectorios":
                archivos.crearDirectorios(path);
                updateMessage("Directorios creados: " + path);
                break;
            case "eliminarDirectorios":
                archivos.eliminarDirectorios(path);
                updateMessage("Directorios eliminados" + path);
                break;
        }
        return null;
    }
}
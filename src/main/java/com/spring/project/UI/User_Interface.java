package com.spring.project.UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

import com.spring.project.system_overlord.Archivos;

public class User_Interface extends Application {

    private Archivos archivos = new Archivos();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gestor de Archivos");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Label archivoLabel = new Label("Archivo:");
        TextField archivoField = new TextField();
        Button crearArchivoBtn = new Button("Crear Archivo");
        Button eliminarArchivoBtn = new Button("Eliminar Archivo");

        Label carpetaLabel = new Label("Carpeta:");
        TextField carpetaField = new TextField();
        Button crearCarpetaBtn = new Button("Crear Carpeta");
        Button eliminarCarpetaBtn = new Button("Eliminar Carpeta");

        Label directorioLabel = new Label("Directorio:");
        TextField directorioField = new TextField();
        Button crearDirectoriosBtn = new Button("Crear Directorios");
        Button eliminarDirectoriosBtn = new Button("Eliminar Directorios");

        TextArea logArea = new TextArea();
        logArea.setEditable(false);
        logArea.setPrefHeight(200);

        grid.add(archivoLabel, 0, 0);
        grid.add(archivoField, 1, 0);
        grid.add(crearArchivoBtn, 2, 0);
        grid.add(eliminarArchivoBtn, 3, 0);

        grid.add(carpetaLabel, 0, 1);
        grid.add(carpetaField, 1, 1);
        grid.add(crearCarpetaBtn, 2, 1);
        grid.add(eliminarCarpetaBtn, 3, 1);

        grid.add(directorioLabel, 0, 2);
        grid.add(directorioField, 1, 2);
        grid.add(crearDirectoriosBtn, 2, 2);
        grid.add(eliminarDirectoriosBtn, 3, 2);

        grid.add(logArea, 0, 3, 4, 1);

        crearArchivoBtn.setOnAction(e -> {
            try {
                archivos.crearArchivo(archivoField.getText());
                logArea.appendText("Archivo creado: " + archivoField.getText() + "\n");
            } catch (IOException ex) {
                logArea.appendText("Error al crear archivo: " + ex.getMessage() + "\n");
            }
        });

        eliminarArchivoBtn.setOnAction(e -> {
            archivos.eliminarArchivo();
            logArea.appendText("Archivo eliminado: " + archivoField.getText() + "\n");
        });

        crearCarpetaBtn.setOnAction(e -> {
            archivos.crearCarpeta(carpetaField.getText());
            logArea.appendText("Carpeta creada: " + carpetaField.getText() + "\n");
        });

        eliminarCarpetaBtn.setOnAction(e -> {
            archivos.eliminarCarpeta();
            logArea.appendText("Carpeta eliminada: " + carpetaField.getText() + "\n");
        });

        crearDirectoriosBtn.setOnAction(e -> {
            archivos.crearDirectorios(directorioField.getText());
            logArea.appendText("Directorios creados: " + directorioField.getText() + "\n");
        });

        eliminarDirectoriosBtn.setOnAction(e -> {
            archivos.eliminarDirectorios();
            logArea.appendText("Directorios eliminados\n");
        });

        Scene scene = new Scene(grid, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
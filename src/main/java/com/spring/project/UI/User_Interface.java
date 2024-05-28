package com.spring.project.UI;

import com.spring.project.threads.ArchivoTask;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import com.spring.project.system_overlord.Archivos;

public class User_Interface extends Application {

    private final Archivos ARCHIVOS = new Archivos();

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
            ArchivoTask task = new ArchivoTask(ARCHIVOS, "crearArchivo", archivoField.getText());
            task.setOnSucceeded(ev -> logArea.appendText(task.getMessage() + "\n"));
            new Thread(task).start();
        });

        eliminarArchivoBtn.setOnAction(e -> {
            ArchivoTask task = new ArchivoTask(ARCHIVOS, "eliminarArchivo", archivoField.getText());
            task.setOnSucceeded(ev -> logArea.appendText(task.getMessage() + "\n"));
            new Thread(task).start();
        });

        crearCarpetaBtn.setOnAction(e -> {
            ArchivoTask task = new ArchivoTask(ARCHIVOS, "crearCarpeta", carpetaField.getText());
            task.setOnSucceeded(ev -> logArea.appendText(task.getMessage() + "\n"));
            new Thread(task).start();
        });

        eliminarCarpetaBtn.setOnAction(e -> {
            ArchivoTask task = new ArchivoTask(ARCHIVOS, "eliminarCarpeta", carpetaField.getText());
            task.setOnSucceeded(ev -> logArea.appendText(task.getMessage() + "\n"));
            new Thread(task).start();
        });

        crearDirectoriosBtn.setOnAction(e -> {
            ArchivoTask task = new ArchivoTask(ARCHIVOS, "crearDirectorios", directorioField.getText());
            task.setOnSucceeded(ev -> logArea.appendText(task.getMessage() + "\n"));
            new Thread(task).start();
        });

        eliminarDirectoriosBtn.setOnAction(e -> {
            ArchivoTask task = new ArchivoTask(ARCHIVOS, "eliminarDirectorios", directorioField.getText());
            task.setOnSucceeded(ev -> logArea.appendText(task.getMessage() + "\n"));
            new Thread(task).start();
        });

        Scene scene = new Scene(grid, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
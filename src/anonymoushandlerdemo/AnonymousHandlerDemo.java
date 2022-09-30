/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package anonymoushandlerdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author usu2dam
 */
public class AnonymousHandlerDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(5);
        Button btnNuevo = new Button("Nuevo");
        Button btnAbrir = new Button("Abrir");
        Button btnGuardar = new Button("Guardar");
        Button btnImprimir = new Button("Imprimir");
        hbox.getChildren().add(btnNuevo);
        hbox.getChildren().add(btnAbrir);
        hbox.getChildren().add(btnGuardar);
        hbox.getChildren().add(btnImprimir);

        btnNuevo.setOnAction((ActionEvent event) -> {
            System.out.println("Nuevo proceso");
        });
        btnAbrir.setOnAction((ActionEvent event) -> {
            System.out.println("Abrir proceso");
        });
        btnGuardar.setOnAction((ActionEvent event) -> {
            System.out.println("Guardar proceso");
        });
        btnImprimir.setOnAction((ActionEvent event) -> {
            System.out.println("Imprimir proceso");
        });
        
        
        Scene scene = new Scene(hbox, 300, 50);
        
        primaryStage.setTitle("AnonymousHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

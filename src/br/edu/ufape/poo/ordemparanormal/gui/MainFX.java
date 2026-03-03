package br.edu.ufape.poo.ordemparanormal.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criamos um Ator (Node) simples
        Label label = new Label("O Outro Lado responde! JavaFX Configurado com Sucesso.");

        // Criamos um Cenário (Layout) e colocamos o Ator lá dentro
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Criamos a Cena com tamanho de 400x200 pixels
        Scene scene = new Scene(root, 400, 200);

        // Configuramos o Palco (Janela do Windows/Mac)
        primaryStage.setTitle("Ordo Realitas: Catálogo do Outro Lado");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // O método launch dispara o ciclo de vida do JavaFX e chama o start()
        launch(args);
    }
}
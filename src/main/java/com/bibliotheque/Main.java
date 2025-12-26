package com.bibliotheque;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Créer des composants
        Label label = new Label("JavaFX installé avec succès ! ");
        Button button = new Button("Cliquez-moi");
        
        // Action du bouton
        button.setOnAction(e -> {
            System.out.println("[LOG] Button clicked");
            label.setText("Vous avez cliqué ! ");
        });
        
        // Mise en page - CRÉER le VBox
        VBox root = new VBox(20);
        root.getChildren().addAll(label, button);
        
        // Créer la scène
        Scene scene = new Scene(root, 400, 300);
        
        // Configurer la fenêtre
        primaryStage.setTitle("Mon App JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

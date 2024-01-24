package org.example._201732050_test_git;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class PaysageJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Création des éléments du paysage
        Rectangle sol = new Rectangle(0, 300, 800, 200);
        sol.setFill(Color.GREEN);

        Rectangle maison = new Rectangle(100, 200, 100, 100);
        maison.setFill(Color.BROWN);

        Circle soleil = new Circle(700, 100, 50, Color.YELLOW);

        Line route = new Line(0, 300, 800, 300);
        route.setStroke(Color.GRAY);

        // Ajout des éléments à la scène
        Pane root = new Pane();
        root.getChildren().addAll(sol, maison, soleil, route);

        // Création de la scène et ajout à la fenêtre principale
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setTitle("Paysage JavaFX");
        primaryStage.setScene(scene);

        // Affichage de la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

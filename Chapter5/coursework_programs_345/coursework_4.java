/*
Other files needed: 1 file, StyleOptionsPane.java
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Demonstrates the use of check boxes.
public class StyleOptions extends Application
{
    // Creates and presents the program window.
    public void start(Stage primaryStage)
    {
        StyleOptionsPane pane = new StyleOptionsPane();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: skyblue");
        
        Scene scene = new Scene(pane, 400, 150);
        primaryStage.setTitle("Style Options");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
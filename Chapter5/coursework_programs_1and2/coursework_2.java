/*
Other files needed: 1 file, FarenheitPane.java
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Demonstrates the use of a TextField and a GridPane.
public class FarenheitConverter extends Application
{
    // Launches the temperature converter application.
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new FahrenheitPane(), 300, 150);

        primaryStage.setTitle("Fahrenheit Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
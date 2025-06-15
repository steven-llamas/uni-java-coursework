/*
Other files needed: 1 file, QuoteOptionsPane.java
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Demonstrates the use of radio buttons.
public class QuoteOptions extends Application
{
    // Creates and presents the program window.
    public void start(Stage primaryStage)
    {
        QuoteOptionsPane pane = new QuoteOptionsPane();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: lightgreen");
        Scene scene = new Scene(pane, 500, 150);
        
        primaryStage.setTitle("Quote Options");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
/*
Program: 1. A basic JavaFX application
Other files needed: N/A
*/

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application
{
    public void start (Stage primaryStage)
    {   // creates & displays two Text objects in a JavaFX window
        Text hello = new Text(50, 50, "Hello, JavaFX!");
        Text question = new Text(120, 80, "How’s it going?");
        Group root = new Group(hello, question);
        Scene scene = new Scene(root, 300, 120, Color.LIGHTGREEN);
        primaryStage.setTitle("A JavaFX Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    // method not required in IDEs that launch JavaFX applications automatically
	public static void main(String[] args) {	launch (args);    }
}
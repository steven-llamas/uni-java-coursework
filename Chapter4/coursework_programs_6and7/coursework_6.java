/*
Program: 6. Images (demostrates use of Image & Imageview objects)
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageDisplay extends Application
{
    public void start (Stage primaryStage)
    { // displays an image centered in a window
        Image img = new Image("gull.jpeg");
        ImageView imgView = new ImageView(img);
        
        StackPane pane = new StackPane(imgView);
        pane.setStyle("-fx-background-color: cornsilk");
        Scene scene = new Scene(root, 500, 350);
        
        primaryStage.setTitle("Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	public static void main(String[] args) {	launch (args);   }
}
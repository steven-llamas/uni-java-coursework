/*
Program: 7. Polygons & Polylines (demostrates use of polygons & polylines)
*/

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Rocket extends Application
{
    public void start (Stage primaryStage)
    { // displays a rocket lifting off, rocket & hatch are polygons, flame is a polyline
        double[] hullPoints = {200, 25, 240, 60, 240, 230, 270, 260, 270, 300, 140, 300, 140, 260, 160, 230, 160, 60};
        Polygon rocket = new Polygon(hullPoints);
        rocket.setFill(Color.BEIGE);
        
        double[] hatchPoints = {185, 70, 215, 70, 220, 120, 180, 120};
        Polygon hatch = new Polygon(hatchPoints);
        hatch.setFill(Color.MAROON);
        
        double[] flamePoints = {142, 310, 142, 330, 150, 325, 155, 380, 165, 340, 175, 360, 190, 350, 200, 375, 215, 330, 220, 360, 225, 355, 230, 370, 240, 340, 255, 370, 260, 335, 268, 340, 268, 310};
        Polyline flame = new Polyline(flamePoints);
        flame.setStroke(Color.RED);
        flame.setStrokeWidth(3);
        
        Group root = new Group(rocket, hatch, flame);
        Scene scene = new Scene(root, 400, 400, Color.BLACK);
        
        primaryStage.setTitle("Rocket");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	public static void main(String[] args) {	launch (args);   }
}
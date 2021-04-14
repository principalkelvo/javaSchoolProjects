/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colourchanger;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 *
 * @author KELVO FRAYAY
 */
public class ColourChanger extends Application {
    @Override
    public void start(Stage stage){
        //create button to set background to blue
        Button colorBlue = new Button("Set Background to Blue");
        //create button to set background to red
        Button colorRed= new Button("Set Background to Red");
        
        //create and configurer a horizontal container to hold the buttons
        HBox buttonBox= new HBox(15);
        buttonBox.setAlignment(Pos.BASELINE_CENTER);
        buttonBox.setBackground(Background.EMPTY);
        //add the buttons to the horizontal container
        buttonBox.getChildren().addAll(colorBlue,colorRed);
        
        //create and configure a new Scene
        Scene scene= new Scene(buttonBox,450,275,Color.GREEN);
        
        //supply the code that is executed when the blue button is executed
        colorRed.setOnAction(e->scene.setFill(Color.RED));
        //supply the code that is executed when the blue button is executed
        colorBlue.setOnAction(e->scene.setFill(Color.BLUE));
        //add the Scene to the stage
        stage.setScene(scene);
        stage.setTitle("Background Color Changer");
        //show the stage
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

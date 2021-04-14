/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_app;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 *
 * @author KELVO FRAYAY
 */
public class Calculator_app extends Application {
    
   
    
    
    //Width and Heught of GUI stored as constants
    private final int WIDTH= 140;
    private final int HEIGHT= 210;
    
    //visual Components
    private TextField calculateField= new TextField();
    private Button number0= new Button("0");
    private Button number1= new Button("1");
    private Button number2= new Button("2");
    private Button number3= new Button("3");
    private Button number4= new Button("4");
    private Button number5= new Button("5");
    private Button number6= new Button("6");
    private Button number7= new Button("7");
    private Button number8= new Button("8");
    private Button number9= new Button("9");
    private Button backSpace= new Button("<-");
    private Button decimalButton= new Button(".");
    private Button multiplyButton= new Button("*");
    private Button addButton= new Button("+");
    private Button minusButton= new Button("-");
    private Button divideButton= new Button("/");
    private Button equalsButton= new Button("=");
    private Button clearTextField= new Button("C");
    private RadioButton onButton= new RadioButton("ON");
    private RadioButton offButton= new RadioButton("OFF");
    
    
    
    
    @Override
    /**Initializes the screen
     * @param stage: The scenes stage
     */
    public void start(Stage stage){
        //create radios VBox
        VBox radios= new VBox(1);
        radios.getChildren().addAll(onButton,offButton);
        //create six HBoxes
        HBox firstRow= new HBox(5);
        HBox secondRow= new HBox(10);
        HBox thirdRow= new HBox(10);
        HBox fourthRow= new HBox(10);
        HBox fifthRow= new HBox(10);
        //add components to HBoxes
        firstRow.getChildren().addAll(radios,backSpace,clearTextField,addButton);
        secondRow.getChildren().addAll(number7,number8,number9,minusButton);
        thirdRow.getChildren().addAll(number4,number5,number6,multiplyButton);
        fourthRow.getChildren().addAll(number1,number2,number3,divideButton);
        fifthRow.getChildren().addAll(number0,decimalButton,equalsButton);
        
        //create VBox
        VBox root= new VBox(10);
        //add all components to VBox
        root.getChildren().addAll(calculateField,firstRow,secondRow,thirdRow,
                                    fourthRow,fifthRow);
        
        //create the Scene
        Scene scene= new Scene(root,Color.LIGHTBLUE);
        
        //set alingment of HBoxes
        firstRow.setAlignment(Pos.CENTER);
        secondRow.setAlignment(Pos.CENTER);
        thirdRow.setAlignment(Pos.CENTER);
        fourthRow.setAlignment(Pos.CENTER);
        fifthRow.setAlignment(Pos.CENTER);
        
        //set alingment of VBoxes
        root.setAlignment(Pos.CENTER);
        
        //set minimum and maximum width of components
        calculateField.setMaxWidth(WIDTH);
        equalsButton.setMaxWidth(50);
        equalsButton.setMinWidth(60);
        firstRow.setMinWidth(WIDTH);
        firstRow.setMaxWidth(WIDTH);
        secondRow.setMinWidth(WIDTH);
        secondRow.setMaxWidth(WIDTH);
        thirdRow.setMinWidth(WIDTH);
        thirdRow.setMaxWidth(WIDTH);
        fourthRow.setMinWidth(WIDTH);
        fourthRow.setMaxWidth(WIDTH);
        fifthRow.setMinWidth(WIDTH);
        fifthRow.setMaxWidth(WIDTH);
        
        root.setMinSize(WIDTH, HEIGHT);
        root.setMaxSize(WIDTH, HEIGHT);
        
        //customize the visual components
        //customize the VBox border and background
        
        //customize buttons
        
        
        //call private methods for button event handlers
        number0.setOnAction(e->displayNumber0());
        number1.setOnAction(e->displayNumber1());
        number2.setOnAction(e->displayNumber2());
        number3.setOnAction(e->displayNumber3());
        number4.setOnAction(e->displayNumber4());
        number5.setOnAction(e->displayNumber5());
        number6.setOnAction(e->displayNumber6());
        number7.setOnAction(e->displayNumber7());
        number8.setOnAction(e->displayNumber8());
        number9.setOnAction(e->displayNumber9());
        backSpace.setOnAction(e->deleteHandler());
        decimalButton.setOnAction(e->displayDecimal());
        multiplyButton.setOnAction(e->multiplyHandler());
        divideButton.setOnAction(e->divideHandler());
        addButton.setOnAction(e->addHandler());
        minusButton.setOnAction(e->minusHandler());
        clearTextField.setOnAction(e->clearHandler());
        equalsButton.setOnAction(e->equalsHandler());
        onButton.setOnAction(e->onHandler());
        offButton.setOnAction(e->offHandler());
        
        
        //configure the the stage and make the stage visible
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.setResizable(false);
        stage.show();
        
        
        //disable on button
        onButton.setDisable(true);
    }
    
    //event handler methods
    
    String operation;
    double  firstNum, secondNum,result;
    
    public void displayNumber0(){
        calculateField.setText(calculateField.getText()+"0");
    }
    public void displayNumber1(){
        calculateField.setText(calculateField.getText()+"1");
    }
    public void displayNumber2(){
        calculateField.setText(calculateField.getText()+"2");
    }
    public void displayNumber3(){
        calculateField.setText(calculateField.getText()+"3");
    }
    public void displayNumber4(){
        calculateField.setText(calculateField.getText()+"4");
    }
    public void displayNumber5(){
        calculateField.setText(calculateField.getText()+"5");
    }
   public void displayNumber6(){
        calculateField.setText(calculateField.getText()+"6");
    }
   public void displayNumber7(){
        calculateField.setText(calculateField.getText()+"7");
    } 
   public void displayNumber8(){
        calculateField.setText(calculateField.getText()+"8");
    }
   public void displayNumber9(){
        calculateField.setText(calculateField.getText()+"9");
    }
   public void displayDecimal(){
        calculateField.setText(calculateField.getText()+".");
        
    }
   public void deleteHandler(){
       int length= calculateField.getText().length();
       int number= length- 1;
       String store;
       if(length>0){
           StringBuilder back= new StringBuilder(calculateField.getText());
           back.deleteCharAt(number);
           store= back.toString();
           calculateField.setText(store);
       }
       
   }
   public void multiplyHandler(){
        //calculateField.setText(calculateField.getText()+"*");
        firstNum= Double.parseDouble(calculateField.getText());
        calculateField.setText("");
       operation= "*";
    }
   public void divideHandler(){
        //calculateField.setText(calculateField.getText()+"/");
        firstNum= Double.parseDouble(calculateField.getText());
        calculateField.setText("");
        operation= "/";
    }
   public void addHandler(){
        //calculateField.setText(calculateField.getText()+"+");
        firstNum= Double.parseDouble(calculateField.getText());
        calculateField.setText("");
        operation= "+";
    }
   public void minusHandler(){
        //calculateField.setText(calculateField.getText()+"-");
        firstNum= Double.parseDouble(calculateField.getText());
        calculateField.setText("");
        operation= "-";
        
    }
   public void clearHandler(){
        calculateField.setText("");
    }
   public void onHandler(){
       
       calculateField.setDisable(false);
       
       onButton.setDisable(true); //On button disabled
       offButton.setDisable(false); //off button enabled
       
        number0.setDisable(false);
        number1.setDisable(false);
        number2.setDisable(false);
        number3.setDisable(false);
        number4.setDisable(false);
        number5.setDisable(false);
        number6.setDisable(false);
        number7.setDisable(false);
        number8.setDisable(false);
        number9.setDisable(false);
        backSpace.setDisable(false);
        clearTextField.setDisable(false);
        divideButton.setDisable(false);
        addButton.setDisable(false);
        minusButton.setDisable(false);
        multiplyButton.setDisable(false);
        decimalButton.setDisable(false);
        equalsButton.setDisable(false);
    }
   public void offHandler(){
       calculateField.setText("");
       calculateField.setDisable(true);
       
       onButton.setDisable(false); //on button enabled
       offButton.setDisable(true); //Off button disabled
       
       number0.setDisable(true);
        number1.setDisable(true);
        number2.setDisable(true);
        number3.setDisable(true);
        number4.setDisable(true);
        number5.setDisable(true);
        number6.setDisable(true);
        number7.setDisable(true);
        number8.setDisable(true);
        number9.setDisable(true);
        backSpace.setDisable(true);
        clearTextField.setDisable(true);
        divideButton.setDisable(true);
        addButton.setDisable(true);
        minusButton.setDisable(true);
        multiplyButton.setDisable(true);
        decimalButton.setDisable(true);
        equalsButton.setDisable(true);
   }
   public void equalsHandler(){
        //calculateField.setText(calculateField.getText()+"=");
        
        String answer;
        secondNum= Double.parseDouble(calculateField.getText());
        switch (operation){
            case "+":
                calculateField.setText("");
                result = firstNum + secondNum;
                answer = String.format("%.0f", result);
                calculateField.setText(answer);
                break;
            case "-":
                result = firstNum - secondNum;
                answer = String.format("%.0f", result);
                calculateField.setText(answer);
                
                break;
            case "*":
                result = firstNum * secondNum;
                answer = String.format("%.0f", result);
                calculateField.setText(answer);
                break;
            case "/":
                result = firstNum / secondNum;
                answer = String.format("%.0f", result);
                calculateField.setText(answer);
                break;
        }
    }
   
   
    public static void main(String[] args) {
        launch(args);
    }
    
}

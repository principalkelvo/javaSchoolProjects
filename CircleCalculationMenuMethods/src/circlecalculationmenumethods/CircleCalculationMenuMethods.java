/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlecalculationmenumethods;

import java.util.Scanner;

/**
 *
 * @author KELVO FRAYAY
 */
public class CircleCalculationMenuMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*This program demonstrates how methods can be used in a 
        menu-driven program*/
        Scanner keyboard = new Scanner (System.in);
        /*The variable below is local to the main method, if the values
        is needed by another method, it must be passed in as a parameter*/
        double radius= -999;//initialize with a dummy value to showthat nothing has been entered
        char choice;//to store menu choice
        do{
            System.out.println();
            System.out.println("***CIRCLE CALCULATIONS***");
            System.out.println();
            System.out.println("1. Enter the radius of the circle");
            System.out.println("2. Display the area of the circle");
            System.out.println("3. Display the circumference of the circle");
            System.out.println("4. Quit");
            System.out.println();
            System.out.println("Enter a number from 1-4");
            System.out.println();
            choice= keyboard.next().charAt(0);
            
            switch(choice){
                case '1':radius=option1();//call method option1
                        break;
                case '2':option2(radius);//call method option2
                        break;
                case '3':option3(radius);//call method option3
                        break;
                case '4':break;
                default :System.out.println("Enter only numbers from 1-4");
                    System.out.println();
            }
        }while(choice !='4');
    }
    //option one gets the user to enter the radius of the circle
    static double option1(){
        double myRadius;//local variable
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter the radius of the circle: ");
        myRadius=keyboard.nextDouble();
        return myRadius;
    }
    //option2 calculates and displays the area of the circle
    static void option2(double radiusIn){
        if (radiusIn==-999){
            System.out.println("radius has not been entered");
        }
        else{
            double area;//local variable
            area=3.1416*radiusIn*radiusIn;//calculate the area
            System.out.println("The area of the circle is: "+ area);
        }
    }
    static void option3(double radiusIn){
        if (radiusIn==-999){
            System.out.println("radius has not been entered");
        }
        else{
            double circumference;//local variable
            circumference=2*3.1416*radiusIn;//calculate the area
            System.out.println("The area of the circle is: "+ circumference);
        }
    }
    
}

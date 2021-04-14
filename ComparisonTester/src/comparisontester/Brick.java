/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparisontester;

/**
 *
 * @author KELVO FRAYAY
 */
public class Brick implements Calculatable {
    private double length;
    private double width;
    private double height;
    
    public Brick(double lengthIn,double widthIn,double heightIn){
        length= lengthIn;
        width= widthIn;
        height= heightIn;
    }
    @Override
    public double calculateVolume(){
        return length*width*height;
    }
}

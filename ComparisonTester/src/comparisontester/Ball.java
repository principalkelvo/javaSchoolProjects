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
public class Ball implements Calculatable {

    private double radius;

    public Ball(double radiusIn) {
        radius = radiusIn;
    }

    @Override
    public double calculateVolume() {
        //uses the costant PI and the method pow from the java.Math.package
        return(4*Math.PI*Math.pow(radius, 3))/3;
    }
}

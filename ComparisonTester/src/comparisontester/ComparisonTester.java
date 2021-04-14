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
public class ComparisonTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ball ballObject= new Ball(10);
        Brick brickObject= new Brick(10,10,10);
        
        VolumeComparison<Ball,Brick> comparison= new VolumeComparison<>(ballObject,brickObject);
        
        switch(comparison.compareVolume()){
            case -1 : System.out.println("The second object has a larger volume");
            break;
            case 1 : System.out.println("The first object has a larger volume");
            break;
            case 0 : System.out.println("The volumes are the same");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublecolondemo2;

/**
 *
 * @author KELVO FRAYAY
 */
public class DoubleColonDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testMethod(Math::sqrt);
        //or
        testMethod(i->Math.sqrt(i));
    }
    
    static void testMethod(DoubleColonInterface testObjectIn){
        System.out.println(testObjectIn.test(25));
    }
}

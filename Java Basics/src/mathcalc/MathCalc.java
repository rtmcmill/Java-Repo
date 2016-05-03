/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathcalc;

/**
 *
 * @author mrobert
 */
public class MathCalc {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) 
    { 
        
        //Calculate the area of a circle
        double radius = 0.0; 
        double circleArea = 100.0; 
        int feet = 0; 
        int inches = 0; 
        radius = Math.sqrt(circleArea/Math.PI); 
        feet = (int)Math.floor(radius); 
        inches = (int)Math.round(12.0*(radius - feet)); 
        System.out.println("The radius of a circle with area " + circleArea + 
                                " square feet is\n " + feet + " feet " + inches + " inches"); 
    
    
        System.out.println();
        
        //Find the Volume of the Sun
        double diameter =  865000;
        double sunVolume = 4 / 3 * Math.PI * Math.pow(diameter/(2*Math.PI),3); 
        
        System.out.println("The Volume of the Sun is " + sunVolume + " miles.");
        
        System.out.println();
        
        //Find the Volume of Earth
        diameter =  7600;
        double earthVolume = 4 / 3 * Math.PI * Math.pow(diameter/(2*Math.PI),3); 
        
        System.out.println("The Volume of the Sun is " + earthVolume + " miles.");
        
        System.out.println();
        
        System.out.println("The Sun to Earth ratio is " + sunVolume/earthVolume + ".");
        
        
        
        
        
    } 
        
}

    


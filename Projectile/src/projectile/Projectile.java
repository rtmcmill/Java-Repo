/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectile;

/**
 *
 * @author mrobert
 */

import java.util.Scanner;

public class Projectile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int distance = 0;
        double gravity = 9.8;
        double theta = 0.0;
        double initialSpeed = 0.0;
        double height = 0.0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the distance from basket: ");
        distance = input.nextInt();
        
        System.out.println("Enter the initial ball speed: ");
        initialSpeed = input.nextDouble();
        
        System.out.println("Enter the heigh of the ceiling: ");
        height = input.nextDouble();
        
    }
    
    
    
   public static double optimalAngle(){
       return 0.0;
   } 
   
   public static double smallAngle(){
       return 0.0;
   }
   
   public static boolean hitCeiling(){
       return true;
   }
   
   
}

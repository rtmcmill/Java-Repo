/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foo.corporation;

/**
 *
 * @author mrobert
 */

public class FooCorporation {

    /**
     * @param args the command line arguments
     */
    public static double basePayCalc(int hours, double wage, String name){
        double totalWage;
        double timeHalf = 0;
        int overTime = 0;
        
        if(hours > 40){
            timeHalf = wage * 1.50;
            overTime = hours - 40;
            hours = 40;
        }
        
        if(hours > 60){
            System.out.println(name+" can't work over 60 hours a week!");
            return 0.0;
        }
        
        if(wage < 8.00){
            System.out.println(name+" can't make less than Minimum Wage!");
            return 0.0;
        }
        
        totalWage = (double)hours * wage + timeHalf*overTime;
        return totalWage;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        double Employee1 = 0;
        double Employee2 = 0;
        double Employee3 = 0;
        
        Employee1 = basePayCalc(35, 7.50, "Employee1");
        Employee2 = basePayCalc(47, 8.20, "Employee2");
        Employee3 = basePayCalc(35, 7.50, "Employee3");
        
        System.out.println("Employee 1 makes $"+Employee1+".");
        System.out.println("Employee 2 makes $"+Employee2+".");
        System.out.println("Employee 3 makes $"+Employee3+".");
    }
    
}

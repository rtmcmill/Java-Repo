/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marathon;

/**
 *
 * @author mrobert
 */
class Marathon {
    
    public static int searchForHigh(int[] list){
        int lowest = 0;
        
        for(int j = 0; j < list.length; j++){
            if(list[lowest] > list[j]){
                lowest = j;
            }
        }
        
        return lowest;
    }
    
    public static int searchForSec(int[] list, int winner){
        int seclowest = 0;
        
        for(int k = 0; k < list.length; k++){
            if((list[k] > list[winner]) && (list[seclowest] > list[k])){
                seclowest = k;
            }
        }
        
        return seclowest;
    }
    public static void main (String[] arguments) {
        String[] names = {
        "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
        "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
        "Aaron", "Kate"
        };
        int[] times = {
        341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
        343, 317, 265
        };
        
        
        for (int i = 0; i < names.length; i++) {
            
            System.out.println(names[i] + ": " + times[i]);
        }
        
        int fastest = searchForHigh(times);
        int secfastest = searchForSec(times, fastest);
        
        //System.out.println(fastest);
        //System.out.println(secfastest);
        
        System.out.println("");        
        System.out.println("Fastest time is " + names[fastest] + " " + times[fastest]);
        System.out.println("Second fastest time is " + names[secfastest] + " " + times[secfastest]);
        
       
    }
}
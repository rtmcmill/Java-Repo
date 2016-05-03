/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plant.project;

/**
 *
 * @author mrobert
 */
public class Plant {
   
    //Plant Name
    private String plantName;
    
    // Plant Description
    private String plantDescription;
    
    // Date Plant was received
    private String purchaseDate;
    
    // interval in hours that plant needs to be watered
    private int waterInterval;

    
    public Plant(String name, String description, 
                        String purchasedate, int waterinterval){
        plantName = name;
        plantDescription = description;
        purchaseDate = purchasedate;
        waterInterval = waterinterval;
        
    }
    
    public void setName(String name){
        plantName = name; 
    }
    
    public void setPlantDescription(String description){
        plantDescription = description;
    }
    
    public void setPurchaseDate(String date){
        purchaseDate = date;
    }
    
    public void setWaterInterval(int hours){
        waterInterval = hours;
}
    
    public String getName(){
        return plantName;
    }
    
    public String getDescription(){
        return plantDescription;
    }
    
    public String getPurchaseDate(){
        return purchaseDate;
    }
    
    public int getWaterInterval(){
        return waterInterval;
    }
    
    
}

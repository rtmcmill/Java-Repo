/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plant.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mrobert
 */
class ViewPlantClass implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e){
        
            for(int i = 0 ; i < PlantProject.plants.size(); i++){
                System.out.println(PlantProject.plants.get(i).getName());
            }
        
    }
    
}
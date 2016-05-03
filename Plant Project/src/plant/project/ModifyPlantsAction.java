/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plant.project;

import java.awt.event.*;
import static plant.project.PlantProject.*;
import static plant.project.ModifyPlants.counter;

/**
 *
 * @author mrobert
 */
public class ModifyPlantsAction implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        frame2.dispose();
        plants.get(counter).setName(textField.getText());
        plants.get(counter).setPurchaseDate(textField2.getText());
        plants.get(counter).setWaterInterval(Integer.parseInt(textField3.getText()));
        plants.get(counter).setPlantDescription(textArea.getText());
        
    }
    
}

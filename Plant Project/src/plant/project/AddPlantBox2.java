/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plant.project;

import java.awt.event.*;
import static plant.project.PlantProject.*;


/**
 *
 * @author mrobert
 */


class AddPlantBox2 implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent ae){
            frame2.setVisible(true);
            frame2.setSize(400, 350);

            //Add Panel to Frame
            //then Add textfield
            frame2.add(panel2);
            panel2.add(PlantProject.addPlantLabel);
            panel2.add(textField);

            //Descript
            panel2.add(PlantProject.addPlantLabelDescript);
            panel2.add(textArea);

            //Purchase Date
            panel2.add(PlantProject.addPlantLabelPurchaseDate);
            panel2.add(textField2);

            //Water Interval
            panel2.add(PlantProject.addPlantLabelWaterInterval);
            panel2.add(textField3);

            //'button'
            panel2.add(PlantProject.addPlantButton2);          
        
    }
    
}


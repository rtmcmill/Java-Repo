/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plant.project;


import java.awt.event.*;
import javax.swing.*;
import static plant.project.PlantProject.*;

/**
 *
 * @author mrobert
 */

public class ModifyPlants implements ActionListener{
    
    static int counter;
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        String[] names = new String[plants.size()];
        
        for(int i = 0; i < plants.size(); i++ ){
            names[i] = plants.get(i).getName();
        }
        
        String optionPane = (String)JOptionPane.showInputDialog(null,"Which plant do you want to modify?",
                                                        "Modify Plant",JOptionPane.QUESTION_MESSAGE, 
                                                        null, names,names[0]);
        
        for(int i  = 0; i < plants.size(); i++){
            if(plants.get(i).getName().equals(optionPane)){
                counter = i;
                break;
                }
        }
        
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
        panel2.remove(PlantProject.addPlantButton2);
        panel2.add(PlantProject.addPlantButton3);

        PlantProject.textArea.setText(plants.get(counter).getDescription());
        PlantProject.textField.setText(plants.get(counter).getName());
        PlantProject.textField2.setText(plants.get(counter).getPurchaseDate());
        PlantProject.textField3.setText(Integer.toString(plants.get(counter).getWaterInterval()));
    
   }
    
}

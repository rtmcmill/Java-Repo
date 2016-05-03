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
class AddPlantAction implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e){
    
           
            System.out.println("Adding Plant");

            PlantProject.plants.add(new Plant(PlantProject.textField.getText(),
                                                PlantProject.textArea.getText(),
                                                PlantProject.textField2.getText(),
                                                Integer.parseInt(PlantProject.textField3.getText())
                                                )
                                    );

            PlantProject.frame2.dispose();
            PlantProject.textArea.setText("");
            PlantProject.textField.setText("");
            PlantProject.textField2.setText("");
            PlantProject.textField3.setText("0");
    }
    
    
}
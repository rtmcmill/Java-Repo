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

import javax.swing.*;
import java.util.ArrayList;



public class PlantProject {

    /**
     * @param args the command line arguments
     */
    // Description field for class Plant
    static ArrayList<Plant> plants = new ArrayList<>();
    
    
    //******* Frame 1 ********\\
    static JFrame frame = new JFrame("Plant Program");
    static JPanel panel = new JPanel();
    static JButton addPlantButton = new JButton("Add a Plant");
    static JButton viewAllPlants = new JButton("View Existing Plants");
    static JButton modifyPlants = new JButton("Modify a Plant");
    
    
    
    //********  Frame 2  **********\
    static JFrame frame2 = new JFrame("Add plant");
    static JPanel panel2 = new JPanel();
    static AddPlantBox2 box1 = new AddPlantBox2();
    static AddPlantAction act = new AddPlantAction();
    static ModifyPlantsAction mAct = new ModifyPlantsAction();

    //Add 'Add' button
    static JButton addPlantButton2 = new JButton("Ok");
    static JButton addPlantButton3 = new JButton("Ok");

    //Add a label
    static JLabel addPlantLabel = new JLabel("Plant Name");
    static JLabel addPlantLabelDescript = new JLabel("Plant Description");
    static JLabel addPlantLabelPurchaseDate = new JLabel("Plant Purchase Date");
    static JLabel addPlantLabelWaterInterval = new JLabel("Watering Interval");

    //New TextField
    static JTextField textField = new JTextField(20);
    static JTextArea textArea = new JTextArea("",10,30);
    static JTextField textField2 = new JTextField(20);
    static JTextField textField3 = new JTextField(20);
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make the frame visible
        frame.setVisible(true);
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add a Panel
        frame.add(panel);

        //*****Add Plant*****\\
        panel.add(addPlantButton);
        
        addPlantButton.addActionListener(box1);
        addPlantButton2.addActionListener(act);
        addPlantButton3.addActionListener(mAct);
        
        //********View Plants********\\
        panel.add(viewAllPlants);
        viewAllPlants.addActionListener(new ViewPlantClass());
        
        
        panel.add(modifyPlants);
        modifyPlants.addActionListener(new ModifyPlants());
        
        }
    
        
}
    




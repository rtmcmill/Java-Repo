/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;
import java.util.ArrayList;

/**
 *
 * @author mrobert
 */
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes.add(new BouncingBox(200, 50, Color.RED));
        boxes.add(new BouncingBox(150, 60, Color.BLACK));
        boxes.add(new BouncingBox(100, 70, Color.BLUE));
        Random rand = new Random();
        
        boxes.get(0).setMovementVector(rand.nextInt(5), -1);
        boxes.get(1).setMovementVector(rand.nextInt(5), 0);
        boxes.get(2).setMovementVector(rand.nextInt(5), 1);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        //3 extra shapes
        //surface.drawRect(0, 0, 60, 20);
        //surface.drawOval(60, 60, 100, 100);
        //surface.drawString("Test Message", 50, 100);
        
        for(int i = 0; i < boxes.size(); i++){
            int k = -1;
            boxes.get(i).draw(surface);
            //boxes.get(i).setMovementVector(i, -k);       
        }
        
    }
} 
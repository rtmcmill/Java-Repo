/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleDraw;

/**
 *
 * @author mrobert
 */
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    //Bouncer movingSprite;
    ArrayList<Bouncer> movingSprite = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        MyShape movingString= new MyShape(15, 20, "Test Message", Color.BLUE);
        
        movingSprite.add(new Bouncer(100, 170, box));
        movingSprite.get(0).setMovementVector(3, 1);
        
        movingSprite.add(new Bouncer(200, 200, movingString));
        movingSprite.get(1).setMovementVector(-3, -1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for(int i = 0; i < movingSprite.size(); i++){
        
        movingSprite.get(i).draw(surface);
        }
    }
}

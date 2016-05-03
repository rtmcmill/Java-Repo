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
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyShape implements Sprite {
    private int width;
    private int height;
    private Color color;
    private String string;

    /**
     * Create a box that has dimensions width and height, filled with
     * startColor.
     */
    public MyShape(int width, int height, String str, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.string = str;
    }

    public void draw(Graphics surface, int x, int y) {
        // Draw the object
        surface.setColor(color);
        //surface.fillRect(x, y, width, height);
        surface.setColor(Color.BLUE);
        //((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawString(string, x, y);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
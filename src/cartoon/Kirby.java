/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cartoon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author user
 */
public class Kirby {
    private static Point position = new Point(25, 25);
    private static Dimension size = new Dimension(250, 250);
    

    public void draw(Graphics graphics) {
        System.out.println("here");
        //kirby
        graphics.setColor(new Color(205, 16, 118));
        graphics.fillOval(position.x + (size.width / 6), position.y + (size.height * 7 / 8), (size.width / 3), (size.height / 4));
        graphics.fillOval(position.x + (size.width*3/5), position.y + (size.height * 7/8), (size.width /3), (size.height / 4));
        
        //graphics.setColor(new Color(255, 130, 180));
        graphics.setColor(new Color(238, 106, 167));
        graphics.fillOval((int) (position.x + (size.width*0.91)), position.y + (size.height/4), (size.width/5), (size.height/3));
        graphics.setColor(new Color(255, 130, 171));
        graphics.fillOval(position.x, position.y, size.width, size.width);
        //graphics.setColor(new Color(255, 130, 180));
        graphics.setColor(new Color(238, 106, 167));
        graphics.fillOval(position.x - 10, position.y + (size.height/3), (size.width/5), (size.height/3));
        graphics.setColor(Color.black);
        graphics.fillOval((int) (position.x + (size.width/2.5)), position.y + (size.height/4), (size.width/10), size.height/5);
        graphics.fillOval((position.x + (size.width*2/3)), position.y + (size.height/4), (size.width/10), size.height/5);
        graphics.setColor(new Color(0, 0, 128));
        graphics.fillOval((int) (position.x + (size.width/2.4)), position.y + (size.height/4), (int) (size.width/13.9), (int) (size.height/5.8));
        graphics.fillOval((int) (position.x + (size.width*0.68)), position.y + (size.height/4), (int) (size.width/13.9), (int) (size.height/5.8));
        graphics.setColor(Color.white);
        graphics.fillOval((int) (position.x + (size.width*0.42)), (int) (position.y + (size.height*0.265)), (int) (size.width/16.7), (int) (size.height/9.25));
        graphics.fillOval((int) (position.x + (size.width*0.68)), (int) (position.y + (size.height*0.265)), (int) (size.width/16.7), (int) (size.height/9.25));
        graphics.setColor(new Color(200, 42, 42));
        graphics.fillOval(position.x+(size.width/2), (int) (position.y +(size.height/1.8)), (int) (size.width/6.25), (int) (size.height/8.33));
        graphics.setColor(Color.red);
        graphics.fillOval((int) (position.x + (size.width*0.53)), (int) (position.y + (size.height*0.615)), (size.width/10), (int) (size.height/16.7));
        graphics.setColor(new Color(255, 52, 179));
        graphics.fillOval(position.x + (size.width/4), (int) (position.y + (size.height*0.45)), (int) (size.width/8.33), (int) (size.height/12.5));
        graphics.fillOval((int) (position.x+ size.width*0.75), (int) (position.y + (size.height*0.45)), (int) (size.width/8.33), (int) (size.height/12.5));

    }
}

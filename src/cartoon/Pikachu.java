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
public class Pikachu {

    private static Point position = new Point(25, 25);
    private static Dimension size = new Dimension(100, 200);

    public void draw(Graphics graphics) {
        graphics.setColor(Color.white);
        graphics.fillRect((int) (position.x+(size.width*3.9)), (int) (position.y+(size.width*2.54)), size.width, size.height/10);
        graphics.fillOval((int) (position.x+(size.width*5.568)), (int) (position.y+(size.height*1.25)), size.width/5, size.height/2);
        graphics.fillRect((int) (position.x+(size.width*5.27)), (int) (position.y+(size.height*1.82)), size.width/5, (int) (size.height/2.2));
        graphics.fillRect((int) (position.x+(size.width*4.75)), (int) (position.y+(size.height*1.82)), size.width/5, (int) (size.height/2.2));
        graphics.setColor(Color.black);
        graphics.drawOval((int) (position.x+(size.width*5.568)), (int) (position.y+(size.height*1.25)), size.width/5, size.height/2);
        graphics.drawRect((int) (position.x+(size.width*3.9)), (int) (position.y+(size.width*2.54)), size.width, size.height/10);
        graphics.drawRect((int) (position.x+(size.width*5.27)), (int) (position.y+(size.height*1.82)), size.width/5, (int) (size.height/2.2));
        graphics.drawRect((int) (position.x+(size.width*4.75)), (int) (position.y+(size.height*1.82)), size.width/5, (int) (size.height/2.2));
        graphics.setColor(new Color(238, 48, 167));
        graphics.fillOval((int) (position.x+(size.width*3.6)), (int) (position.y+(size.width*2.4)), size.width/2, size.height/4);
        graphics.fillOval((int) (position.x+(size.width*5.19)), (int) (position.y+(size.height*2.235)), (int) (size.width/2), (int) (size.height/4.5));
        graphics.fillOval((int) (position.x+(size.width*4.59)), (int) (position.y+(size.height*2.235)), (int) (size.width/2), (int) (size.height/4.5));
        graphics.fillOval((int) (position.x+(size.width*5.4)), (int) (position.y+(size.width*3.2)), size.width/2, size.height/4);
        graphics.setColor(new Color(89, 89, 171));
        graphics.fillOval((int) (position.x + (size.width * 4.6)), (int) (position.y + (size.height / 1.1)), size.width, size.height);
        graphics.fillOval((int) (position.x + (size.width * 4.56)), (int) (position.y + (size.height * 1.45)), (int) (size.width * 1.1), (int) (size.height / 2.2));
        graphics.setColor(new Color(238, 48, 167));
        graphics.fillOval((int) (position.x + (size.width * 4.8)), position.y + (size.height / 28), (int) (size.width / 1.8), (int) (size.width / 1.8));
        graphics.setColor(Color.white);
        graphics.fillRoundRect((int) (position.x + (size.width * 4.25)), (int) (position.y + size.height / 3.8), (int) (size.width * 1.7), (int) (size.height / 1.17), 30, 30);
        graphics.setColor(Color.black);
        graphics.drawRoundRect((int) (position.x + (size.width * 4.25)), (int) (position.y + size.height / 3.8), (int) (size.width * 1.7), (int) (size.height / 1.17), 30, 30);
        graphics.setColor(new Color(245, 204, 176));
        graphics.fillRoundRect((int) (position.x + (size.width * 4.405)), (int) (position.y + size.height / 2.9), (int) (size.width * 1.4), (int) (size.height / 1.4), 30, 30);
        graphics.setColor(Color.black);
        graphics.fillRoundRect((int) (position.x + (size.width * 4.7)), (int) (position.y + size.height / 2.2), (size.width / 7), (int) (size.height / 1.8), size.width / 5, size.height / 10);
        graphics.fillRoundRect((int) (position.x + (size.width * 5.35)), (int) (position.y + size.height / 2.3), (size.width / 7), (int) (size.height / 1.8), size.width / 5, size.height / 10);
        graphics.fillRoundRect((int) (position.x + (size.width * 4.55)), (int) (position.y + size.height * 1.47), (int) (size.width * 1.06), (size.height / 8), size.width / 5, size.height / 10);
        graphics.setColor(Color.yellow);
        graphics.fillRect((int) (position.x+(size.width*4.91)), (int) (position.y+(size.height*1.45)), size.width/3, size.height/24);
        graphics.fillRect((int) (position.x+(size.width*4.91)), (int) (position.y+(size.height*1.45)), size.width/12, size.width/3);
        graphics.fillRect((int) (position.x+(size.width*4.91)), (int) (position.y+(size.height*1.58)),size.width/3, size.height/24);
        graphics.fillRect((int) (position.x+(size.width*5.19)), (int) (position.y+(size.height*1.45)), size.width/12, size.width/3);
        graphics.setColor(Color.BLACK);
        //tilt
        graphics.fillRect((int) (position.x + (size.width * 4.6)), (int) (position.y + (size.height / 2.6)), (int) (size.width/2.5), (int) (size.height/22.2));
        graphics.fillRect((int) (position.x + (size.width * 5.2)), (int) (position.y + (size.height / 3)), (int) (size.width/2.5), (int) (size.height/22.2));
        graphics.setColor(new Color(48,48,48));
        graphics.drawArc((int) (position.x+(size.width*3.2)), (int) (position.y+(size.height*0.57)), size.width, size.height/2, 80, 80);
        graphics.fillOval((int) (position.x+(size.width*2.85)), (int) (position.y+(size.height*2/3)), (int) (size.width*1.3), (int) (size.height/1.5));
        graphics.setColor(new Color(84,84,84));
        graphics.fillOval((int) (position.x+(size.width*3.45)), position.y+(size.height*3/4), (int) (size.width/2.5), size.height/5);
        graphics.setColor(Color.red);
        graphics.fillOval((int) (position.x+(size.width*3.7)), position.y+(size.height*1/2), size.width/3, size.height/6);
        graphics.setColor(Color.orange);
        graphics.fillOval((int) (position.x+(size.width*3.9)), position.y+(size.height*5/9), size.width/10, size.height/20);


    }
}

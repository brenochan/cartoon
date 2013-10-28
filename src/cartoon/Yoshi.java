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
public class Yoshi {

    private static Point position = new Point(10, 10);
    private static Dimension size = new Dimension(200, 200);

    public void draw(Graphics graphics) {
        graphics.setColor(Color.red);
        graphics.fillOval((int) (position.x + size.width * 4.12), (int) (position.y + size.height * 0.7), (int) (size.width * 0.4), size.height / 4);
        graphics.fillOval((int) (position.x + size.width * 4.21), (int) (position.y + size.height * 0.95), (int) (size.width * 0.4), size.height / 4);
        graphics.fillOval((int) (position.x + size.width * 4.2), (int) (position.y + size.height * 1.21), (int) (size.width * 0.4), (int) (size.height * 0.23));
        graphics.setColor(new Color(0, 205, 0));
        graphics.fillOval((int) (position.x + (size.width * 3.5)), (int) (position.y + (size.height * 1.65)), (int) (size.width * 0.6), size.height / 5);
        graphics.fillOval((int) (position.x + (size.width * 4.01)), (int) (position.y + (size.height * 0.85)), size.width / 2, size.height / 2);
        graphics.fillOval((int) (position.x + (size.width * 3.9)), position.y + size.height, (int) (size.width * 0.55), (int) (size.height * 1.3));
        graphics.fillOval((int) (position.x + (size.width * 4)), (int) (position.y + size.height * 1.75), (int) (size.width), (int) (size.height * 0.6));
        graphics.fillOval((int) (position.x + size.width * 4.34), (int) (position.y + (size.height * 1.43)), size.width / 2, size.height / 5);
        graphics.setColor(Color.white);
        graphics.fillOval((int) (position.x + (size.width * 3.88)), (int) (position.y + (size.height * 1.6)), (int) (size.width * 0.2), (int) (size.height * 0.6));
        graphics.setColor(new Color(0, 205, 0));
        graphics.fillOval((int) (position.x + (size.width * 4)), (int) (position.y + (size.height * 0.45)), (int) (size.width * 0.36), (int) (size.height / 1.7));
        graphics.fillOval((int) (position.x + (size.width * 3.7)), (int) (position.y + (size.height * 0.45)), (int) (size.width * 0.36), (int) (size.height / 1.7));
        graphics.fillOval((int) (position.x + (size.width * 3.95)), (int) (position.y + (size.height * 0.85)), (int) (size.width / 7), (int) (size.height / 7));
        graphics.setColor(Color.white);
        graphics.fillOval((int) (position.x + (size.width * 3.7)), (int) (position.y + (size.height * 1.05)), (int) (size.width / 2), (int) (size.height / 2));
        graphics.fillOval((int) (position.x + (size.width * 4.07)), (int) (position.y + (size.height * 0.6)), size.width / 5, (int) (size.height * 0.35));
        graphics.fillOval((int) (position.x + (size.width * 3.79)), (int) (position.y + (size.height * 0.6)), size.width / 5, (int) (size.height * 0.35));
        graphics.setColor(Color.black);
        graphics.fillOval((int) (position.x + (size.width * 4.15)), (int) (position.y + (size.height * 0.72)), size.width / 8, (int) (size.height * 0.2));
        graphics.fillOval((int) (position.x + (size.width * 3.865)), (int) (position.y + (size.height * 0.7)), size.width / 8, (int) (size.height * 0.2));
        graphics.setColor(new Color(0, 0, 156));
        graphics.fillOval((int) (position.x + (size.width * 4.165)), (int) (position.y + (size.height * 0.75)), size.width / 10, (int) (size.height * 0.15));
        graphics.fillOval((int) (position.x + (size.width * 3.875)), (int) (position.y + (size.height * 0.72)), size.width / 10, (int) (size.height * 0.15));
        graphics.setColor(Color.white);
        graphics.fillOval((int) (position.x + (size.width * 4.18)), (int) (position.y + (size.height * 0.75)), size.width / 16, (int) (size.height * 0.08));
        graphics.fillOval((int) (position.x + (size.width * 3.89)), (int) (position.y + (size.height * 0.72)), size.width / 16, (int) (size.height * 0.08));
        graphics.fillOval((int) (position.x + (size.width * 4)), (int) (position.y + (size.height * 0.9)), (int) (size.width / 2), (int) (size.height / 2));
        graphics.setColor(new Color(0, 205, 0));
        graphics.drawOval((int) (position.x + (size.width * 4)), (int) (position.y + (size.height * 0.9)), (int) (size.width / 2), (int) (size.height / 2));
        graphics.fillOval((int) (position.x + (size.width * 3.4)), (int) (position.y + (size.height * 4 / 5)), (int) (size.width / 1.4), (int) (size.height / 1.4));
        graphics.setColor(Color.black);
        graphics.fillRect((int) (position.x + (size.width * 3.55)), position.y + (size.height), size.width / 10, size.height / 40);
        graphics.fillRect((int) (position.x + (size.width * 3.8)), position.y + (size.height), size.width / 10, size.height / 40);
        graphics.setColor(Color.white);
        graphics.fillOval((int) (position.x + (size.width * 4.35)), (int) (position.y + (size.height * 1.65)), size.width / 2, size.height / 3);
        graphics.fillOval((int) (position.x + (size.width * 4.65)), (int) (position.y + (size.height * 0.85)), size.width / 2, (int) (size.height * 0.7));
        graphics.setColor(Color.red);
        graphics.fillOval((int) (position.x + (size.width * 4.38)), (int) (position.y + (size.height * 1.68)), (int) (size.width * 0.40), (int) (size.height * 0.25));
        graphics.setColor(new Color(0, 205, 0));
        graphics.fillOval((int) (position.x + (size.width * 4.7)), (int) (position.y + (size.height * 1.15)), size.width / 6, (int) (size.height * 0.25));
        graphics.fillOval((int) (position.x + (size.width * 4.85)), (int) (position.y + (size.height * 0.91)), size.width / 4, (int) (size.height * 0.3));
        graphics.fillOval((int) (position.x + (size.width * 4.87)), (int) (position.y + (size.height * 1.24)), size.width / 4, (int) (size.height * 0.25));
        int[] xPoints = {position.x + size.width * 47 / 10, position.x + size.width * 51 / 10, position.x + size.width * 5};
        int[] yPoints = {position.y + size.height * 2, position.y + size.height * 17 / 10, position.y + size.height * 2};
        graphics.fillPolygon(xPoints, yPoints, 3);
        graphics.fillOval((int) (position.x + (size.width * 4.1)), (int) (position.y + (size.height * 2.15)), size.width / 4, size.height / 2);
        graphics.fillOval((int) (position.x + (size.width * 4.45)), (int) (position.y + (size.height * 2.15)), size.width / 4, size.height / 2);
        graphics.setColor(Color.yellow);
        graphics.fillOval((int) (position.x + (size.width * 4.38)), (int) (position.y + (size.height * 2.62)), (int) (size.width / 2.6), (int) (size.height / 5.4));
        graphics.fillOval((int) (position.x + (size.width * 4)), (int) (position.y + (size.height * 2.62)), (int) (size.width / 2.6), (int) (size.height / 5.4));
        graphics.setColor(new Color(238, 118, 33));
        graphics.fillOval((int) (position.x + (size.width * 4.45)), (int) (position.y + (size.height * 2.55)), (int) (size.width / 3.5), (int) (size.height / 10));
        graphics.fillOval((int) (position.x + (size.width * 4.38)), (int) (position.y + (size.height * 2.6)), (int) (size.width / 2.6), (int) (size.height / 5.4));
        graphics.fillOval((int) (position.x + (size.width * 4.08)), (int) (position.y + (size.height * 2.55)), (int) (size.width / 3.5), (int) (size.height / 10));
        graphics.fillOval((int) (position.x + (size.width * 4)), (int) (position.y + (size.height * 2.6)), (int) (size.width / 2.6), (int) (size.height / 5.4));
        graphics.setColor(Color.yellow);
        graphics.drawOval((int) (position.x + (size.width * 4.45)), (int) (position.y + (size.height * 2.55)), (int) (size.width / 3.5), (int) (size.height / 10));
        graphics.drawOval((int) (position.x + (size.width * 4.08)), (int) (position.y + (size.height * 2.55)), (int) (size.width / 3.5), (int) (size.height / 10));




    }
}
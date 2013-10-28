/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cartoon;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.WIDTH;

/**
 *
 * @author user
 */
public class MyDrawingSurface extends Environment {
    Kirby myKirby;
    Pikachu myPikachu;
    Yoshi myYoshi;

    @Override
    public void initializeEnvironment() {
        this.setBackground(new Color(0,191,255));
        myKirby = new Kirby();
        myPikachu = new Pikachu();
        myYoshi = new Yoshi();
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        
       // System.out.println("Painting!!!");

        //backgroung
        graphics.setColor(Color.yellow);
        graphics.fillOval(1000, -90, 300, 300);
        graphics.setColor(Color.gray);
        graphics.fillRect(0, 300, 330, 410);
        graphics.fillRect(310, 490, 350, 2200);
        graphics.fillRect(630,560, 400, 150);
        graphics.setColor(Color.white);
        graphics.fillOval(130, -60, 90, 90);
        graphics.fillOval(450, -70, 90, 90);
        graphics.fillOval(190, -40, 90, 90);
        graphics.fillOval(250, -30, 90, 90);
        graphics.fillOval(320, -30, 90, 90);
        graphics.fillOval(390, -30, 90, 90);
        
        myKirby.draw(graphics);
        myPikachu.draw(graphics);
        myYoshi.draw(graphics);
//        //kirby
//        graphics.setColor(new Color(205, 16, 118));
//        graphics.fillOval( 80, 250, 90, 60);
//        graphics.fillOval(180, 245, 90, 60);
//        //graphics.setColor(new Color(255, 130, 180));
//        graphics.setColor(new Color(238, 106, 167));
//        graphics.fillOval(250, 90, 50, 80);
//        graphics.setColor(new Color(255, 130, 171));
//        graphics.fillOval(50, 50, 230, 230);
//        //graphics.setColor(new Color(255, 130, 180));
//        graphics.setColor(new Color(238, 106, 167));
//        graphics.fillOval(30, 140, 50, 80);
//        graphics.setColor(Color.black);
//        graphics.fillOval(125, 85, 25, 55);
//        graphics.fillOval(180, 85, 25, 55);
//        graphics.setColor(new Color(0, 0, 128));
//        graphics.fillOval(128, 89, 18, 43);
//        graphics.fillOval(183, 89, 18, 43);
//        graphics.setColor(Color.white);
//        graphics.fillOval(129, 89, 15, 27);
//        graphics.fillOval(184, 89, 15, 27);
//        graphics.setColor(new Color(200, 42, 42));
//        graphics.fillOval(150, 160, 40, 30);
//        graphics.setColor(Color.red);
//        graphics.fillOval(158, 175, 25, 15);
//        graphics.setColor(new Color(255, 52, 179));
//        graphics.fillOval(100, 140, 30, 20);
//        graphics.fillOval(200, 140, 30, 20);
//
//        //bomberman
//        graphics.setColor(Color.white);
//        graphics.fillRect(420, 280, 100, 20);
//        graphics.fillOval(580, 280, 20, 100);
//        graphics.fillRect(550, 390, 20, 100);
//        graphics.fillRect(500, 390, 20, 100);
//        graphics.setColor(Color.black);
//        graphics.drawOval(580, 280, 20, 100);
//        graphics.drawRect(420, 280, 100, 20);
//        graphics.drawRect(550, 390, 20, 100);
//        graphics.drawRect(500, 390, 20, 100);
//        graphics.setColor(new Color(238, 48, 167));
//        graphics.fillOval(390, 265, 50, 50);
//        graphics.fillOval(540, 455, 60, 40);
//        graphics.fillOval(470, 455, 60, 40);
//        //tilt
//        graphics.fillOval(570, 365, 50, 50);
//        graphics.setColor(new Color(89, 89, 171));
//        graphics.fillOval(484, 200, 100, 200);
//        graphics.fillOval(479, 310, 110, 90);
//        graphics.setColor(new Color(238, 48, 167));
//        graphics.fillOval(505, 50, 60, 60);
//        graphics.setColor(Color.white);
//        graphics.fillRoundRect(450, 100, 170, 170, 30, 30);
//        graphics.setColor(Color.black);
//        graphics.drawRoundRect(450, 100, 170, 170, 30, 30);
//        graphics.setColor(new Color(245, 204, 176));
//        graphics.fillRoundRect(465, 114, 140, 140, 30, 30);
//        graphics.setColor(Color.black);
//        graphics.fillRoundRect(496, 118, 14, 110, 20, 20);
//        graphics.fillRoundRect(562, 118, 14, 110, 20, 20);
//        graphics.fillRoundRect(480, 312, 105, 25, 20, 20);
//        graphics.setColor(Color.yellow);
//        graphics.fillRect(512, 310, 34, 7);
//        graphics.fillRect(512, 310, 7, 30);
//        graphics.fillRect(540, 310, 7, 30);
//        graphics.fillRect(512, 335, 34, 7);
//        graphics.setColor(Color.BLACK);
//        graphics.fillOval(WIDTH, WIDTH, WIDTH, WIDTH);
//        //tilt
//        graphics.fillRect(484, 111, 40, 9);
//        graphics.fillRect(545, 107, 40, 9);
//        graphics.setColor(new Color(48,48,48));
//        graphics.drawArc(330, 135, 90, 80, 80, 80);
//        graphics.fillOval(300, 150, 140, 140);
//        graphics.setColor(new Color(84,84,84));
//        graphics.fillOval(376, 180, 40, 40);
//        graphics.setColor(Color.red);
//        graphics.fillOval(380, 120, 30, 30);
//        graphics.setColor(Color.orange);
//        graphics.fillOval(388, 125, 10, 10);
//
        
    }
}

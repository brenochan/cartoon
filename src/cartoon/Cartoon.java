/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cartoon;

import environment.ApplicationStarter;

/**
 *
 * @author user
 */
public class Cartoon {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       start();
    }

    private static void start() {
        ApplicationStarter.run("Breno's Drawing Surface!", new MyDrawingSurface());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybird;

import javax.swing.JFrame;

/**
 *
 * @author ldcha
 */
public class FlappyBird {
    
    public static FlappyBird flappyBird;
    
    public final int WIDTH=800, HEIGHT=800;
    
    public FlappyBird(){
        JFrame jframe = new JFrame();
        
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);
    }
    
    public static void main(String[] args) {
       flappyBird = new FlappyBird();
    }
    
}

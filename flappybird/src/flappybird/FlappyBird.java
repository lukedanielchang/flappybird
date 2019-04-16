/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author ldcha
 */
public class FlappyBird implements ActionListener {

    public static FlappyBird flappyBird;

    public final int WIDTH = 800, HEIGHT = 800;
    public Renderer renderer;

    public Rectangle bird;
    public Random rand;
    public ArrayList<Rectangle> columns;
    
    public FlappyBird() {

        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);

        renderer = new Renderer();
        
        jframe.add(renderer);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);
        jframe.setTitle("Flappy Bird");
        jframe.setResizable(false);
        
        bird = new Rectangle(WIDTH/2-10, HEIGHT/2-10, 20, 20);
        columns = new ArrayList<Rectangle>();
        
        timer.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        renderer.repaint();
    }

    public void addColumn(){
        int space= 300;
        int width = 100;
        //set min heght 50, max 350
        int height = 50 + rand.nextInt(300);
        
        columns.add(new Rectangle(WIDTH + width + columns.size() *300, height));
    }
    
    public void paintColumns(Graphics g, Rectangle column){
        g.setColor(Color.green.darker());
        g.fillRect(column.x, column.y, column.width, column.height);
    }
     void repaint(Graphics g) {
            //set sky color
            g.setColor(Color.cyan);
            g.fillRect(0, 0, WIDTH, HEIGHT);
            
            //add base color
            g.setColor(Color.orange);
            g.fillRect(0, HEIGHT -150, WIDTH, 120);
            
            //grass color
            g.setColor(Color.green);
            g.fillRect(0, HEIGHT-150, WIDTH, 20);
            
            //bird colors
            g.setColor(Color.red);
            g.fillRect(bird.x, bird.y, bird.width, bird.height);       
    }
     
    public static void main(String[] args) {
        flappyBird = new FlappyBird();
    }

   

}

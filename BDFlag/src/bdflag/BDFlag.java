/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdflag;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import jdk.nashorn.internal.ir.Flags;

/**
 *
 * @author joy
 */
public class BDFlag extends Canvas {
public void paint(Graphics g){
    g.setColor(Color.GREEN);
    g.fillRect(50,50,700,300);//, WIDTH, WIDTH, HEIGHT);
    g.setColor(Color.RED);
    g.fillOval(300,100,200,200);
}
    public static void main(String[] args) {
       BDFlag m = new BDFlag();
       JFrame f = new JFrame();
       f.add(m);
       f.setSize(600,400);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

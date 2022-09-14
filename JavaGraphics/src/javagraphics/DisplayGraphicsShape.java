/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagraphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DisplayGraphicsShape extends Canvas {
   public void paint(Graphics g){
     g.drawString("Hello", 50, 30);
     g.fillRect(70, 40, 80, 80);
     setBackground(Color.WHITE);
     g.fillOval(180, 90, 40, 40);
     g.fillOval(140, 60, 50, 50);
     setForeground(Color.BLUE);
     g.drawArc(30, 150, 60, 150, 60, 80);
     
   } 
   public static void main(String [] args){
       DisplayGraphicsShape m = new DisplayGraphicsShape();
       JFrame f = new JFrame();
       
       f.add(m);
       f.setSize(400,600);
       f.setVisible(true);
       
   }
    
}
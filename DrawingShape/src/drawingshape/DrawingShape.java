/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingshape;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author joy
 */
public class DrawingShape extends Canvas {

    public static void main(String[] args) {
      JFrame frame = new JFrame("My Drawing");
      Canvas canvas = new DrawingShape();
      canvas.setSize(1400,800);
      frame.add(canvas);
      frame.pack();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.fillOval(100,100,200,200);
        g.fillArc(100, 400, 50,50,0,90);
        
        int []x={42,52,72,52,60,40,15,28,9,32,42};
        int []y= {38,62,62,80,105,85,102,75,58,60,38};
        
        int []a = {400,450,400,450};
        int []b = {400,400,450,450};
        g.fillPolygon(a,b,4);
        
        g.fillRoundRect(500, 100,100,100,100,100);
    }
    
}

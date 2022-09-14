/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframedemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JframeDemo {

    public static void main(String[] args) {
      JFrame f = new JFrame("Button Example");
      final JTextField tf = new JTextField();
      tf.setBounds(50,50,150,20);
      JButton b = new JButton(new ImageIcon("F:\\Youtube all photos\\Chakrir Thumnail.png"));
      b.setBounds(50,100,265,60);
      b.addActionListener(new ActionListener(){
       
          @Override
          public void actionPerformed(ActionEvent g) {
              tf.setText("Welcome to JavaPoint.");
              
          }
      });
      f.add(b);
      f.add(tf);
      f.setSize(400,400);
      f.setLayout(null);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

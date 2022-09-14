/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbtndemo11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JBtnDemo {
    public static void main(String [] args){
       JFrame f = new JFrame ("Button Example");
       final JTextField tf = new JTextField();
       tf.setBounds(50,50,150,20);
       JButton b = new JButton(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\C:\\Users\\Public\\Pictures\\Sample Pictures.jpg"));
       b.setBounds(50,50,150,20);
       b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
             tf.setText("Welcome to JavatPoint.");
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
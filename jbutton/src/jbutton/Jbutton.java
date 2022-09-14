
package jbutton;

import java.awt.event.*;
import javax.swing.*;

public class Jbutton {

    public static void main(String[] args) {
       JFrame f = new JFrame("Button Example");
       final JTextField tf = new JTextField();
       tf.setBounds(50,50,150,20);
      JButton b = new JButton(new ImageIcon("D:\\rsz_pexels-pixabay-36762.jpg"));
       b.setBounds(50,100,500,100);
       b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
           tf.setText("Welcome to Javatpoint.");}
       });
       f.add(b);
       f.add(tf);
       f.setSize(500,500);
       f.setLayout(null);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

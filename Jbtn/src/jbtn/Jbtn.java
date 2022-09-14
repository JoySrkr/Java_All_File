
package jbtn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Jbtn {

    public static void main(String[] args) {
       JFrame f = new JFrame("Button Example");
       final JTextField tf = new JTextField();
       tf.setBounds(50,50,150,20);
       JButton b = new JButton(new ImageIcon("F:\\All CSE File\\2nd Year 1st semester\\175337608_1123614938135256_9010716782925630751_n.jpg"));
       b.setBounds(50,100,265,260);
       b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               tf.setText("Welcome to Javatpoint.");
               
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

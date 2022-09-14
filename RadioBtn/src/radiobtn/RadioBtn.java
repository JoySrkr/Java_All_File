
package radiobtn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
class JRadioBtnDemo extends JFrame{
    JRadioButton jRadioButton1;
    JRadioButton jRadioButton2;
    JButton jButton;
    ButtonGroup G1;
    JLabel L1;
    public JRadioBtnDemo(){
      this.setLayout(null);
      jRadioButton1 = new JRadioButton();
      jRadioButton2 = new JRadioButton();
      jButton = new JButton("Click");
      G1 = new ButtonGroup();
      L1 = new JLabel("Qualification");
      jRadioButton1.setText("Under-Graduate");
      jRadioButton2.setText("Gradute");
      jRadioButton1.setBounds(120,30,120,50);
      jRadioButton2.setBounds(250,30,80,50);
      jButton.setBounds(125,90,80,30);
      L1.setBounds(20,30,150,50);
      this.add(jRadioButton1);
      this.add(jRadioButton2);
      this.add(jButton);
      this.add(L1);
      G1.add(jRadioButton1);
      G1.add(jRadioButton2);
      jButton.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
          String qual =  " ";
          if(jRadioButton1.isSelected()){
              qual = "Under-Graduate";
          } else if(jRadioButton2.isSelected()){
              qual = "Graduate";   
          }else{
              qual = "No Button Selected";
          }
          JOptionPane.showMessageDialog(JRadioBtnDemo.this,qual);
          } 
      });
    }
}
 class RadioBtn {
    public static void main(String[] args) {
        JRadioBtnDemo f = new JRadioBtnDemo();
        f.setBounds(100,100,400,200);
        f.setTitle("RadioButtons");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}

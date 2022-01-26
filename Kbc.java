import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class KBC implements ActionListener
{
JFrame fr;
JRadioButton rb1,rb2,rb3,rb4;
JLabel lb;
JButton b1,b2;
ButtonGroup bg;
Container c;

int cn;
String ques[]={"Who developed java?","Who is founder of Apple?","Capital of spain ?",
"what is the Capital of Sikkim?"};
String op1[]={"Steve","Bill","paris","Gangtok"};
String op2[]={"James","Steve","London","Izol"};
String op3[]={"Dennis","Sunder","Berlin","Kohima"};
String op4[]={"Tim","Herbert","Madrid","Agartala"};
String ans[]={"James","Steve","Madrid","Gangtok"};

KBC ()
{
fr=new JFrame();
fr.setLayout(null);
fr.setSize(600,600);

lb=new JLabel(ques[cn]);
lb.setBounds(50,50,400,50);
fr.add(lb);

rb1=new JRadioButton(op1[cn]);
rb1.setBounds(50,180,100,100);
fr.add(rb1);

rb2=new JRadioButton(op2[cn]);
rb2.setBounds(180,180,100,100);
fr.add(rb2);

rb3=new JRadioButton(op3[cn]);
rb3.setBounds(50,300,100,100);
fr.add(rb3);

rb4=new JRadioButton(op4[cn]);
rb4.setBounds(180,300,100,100);
fr.add(rb4);

b1=new JButton("Submit");
b1.setBounds(50,450,80,80);
fr.add(b1);

bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
bg.add(rb4);

b2=new JButton("Next");
b2.setBounds(180,450,80,80);
fr.add(b2);

b1.addActionListener(this);
b2.addActionListener(this);

fr.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{

	
  if(e.getSource()==b2)
 {
 cn++;
lb.setText(ques[cn]);
rb1.setText(op1[cn]);
rb2.setText(op2[cn]); 
rb3.setText(op3[cn]);
rb4.setText(op4[cn]);
b1.setEnabled(true);
bg.clearSelection();

}
if(e.getSource()==b1)
{
String an=" ";
if(rb1.isSelected())
an=rb1.getText();
if(rb2.isSelected())
an=rb2.getText();
if(rb3.isSelected())
an=rb3.getText();
if(rb4.isSelected())
an=rb4.getText();
if(an.equals(ans[cn]))
JOptionPane.showMessageDialog(fr,"Right Answer");
else
JOptionPane.showMessageDialog(fr,"Wrong Answer");
b1.setEnabled(false);
}
}
public static void main(String s[])
{
 new KBC();
 }
 

}
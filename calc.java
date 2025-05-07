import java.awt.*;
import java.awt.event.*;
public class calc implements ActionListener {
 int n;
 String c,s1,s2,s3,s4,s5;
 Frame f;
 Button
b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bMul,bDiv,bMod,bEquals,bClear;
 Panel p;
 TextField tf;
 calc() {
 f = new Frame();
 p = new Panel();
 // Creating the components
 tf = new TextField(20);
 b0 = new Button("0");
 b1 = new Button("1");
 b2 = new Button("2");
 b3 = new Button("3");
 b4 = new Button("4");
 b5 = new Button("5");
 b6 = new Button("6");
 b7 = new Button("7");
 b8 = new Button("8");
 b9 = new Button("9");
 bAdd = new Button("+");
 bSub = new Button("-");
 bMul = new Button("*");
 bDiv = new Button("/");
 bMod = new Button("%");
 bEquals = new Button("=");
 bClear = new Button("CE");
 //Adding the Actionlistener to the components
 b0.addActionListener(this);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 b5.addActionListener(this);
 b6.addActionListener(this);
 b7.addActionListener(this);
 b8.addActionListener(this);
 b9.addActionListener(this);
 bAdd.addActionListener(this);
 bSub.addActionListener(this);
 bMul.addActionListener(this);
 bDiv.addActionListener(this);
 bMod.addActionListener(this);
 bEquals.addActionListener(this);
 bClear.addActionListener(this);
f.setLayout(new FlowLayout());
 p.setLayout(new GridLayout(4,5,4,4));
 //Adding TextField component on to Frame
 f.add(tf);
 //Adding Button components on to Panel
 p.add(b0); p.add(b1); p.add(b2); p.add(b3); p.add(b4); p.add(b5);
p.add(b6); p.add(b7); p.add(b8); p.add(b9);
 p.add(bAdd); p.add(bSub); p.add(bMul); p.add(bDiv); p.add(bMod);
p.add(bEquals); p.add(bClear);
 //Adding the panel on to Frame
 f.add(p);
 f.setSize(200,200);
 f.setVisible(true);
 }
 //Overriding the ActionListener method
 public void actionPerformed(ActionEvent e) {
 if(e.getSource() == b0) {
 s3 = tf.getText();
 s4 = "0";
 s5 = s3+s4; // for accepting more than one-digit number,

 tf.setText(s5);
 }
 if(e.getSource() == b1) {
 s3 = tf.getText();
 s4 = "1";
 s5 = s3+s4;
 tf.setText(s5);
 }
 if(e.getSource() == b2) {
 s3 = tf.getText();
 s4 = "2";
 s5 = s3+s4;
 tf.setText(s5);
 }
 if(e.getSource() == b3) {
 s3 = tf.getText();
 s4 = "3";
 s5 = s3+s4;
 tf.setText(s5);
 }
 if(e.getSource() == b4) {
 s3 = tf.getText();
 s4 = "4";
 s5 = s3+s4;
 tf.setText(s5);
 }
 if(e.getSource() == b5) {
 s3 = tf.getText();
 s4 = "5";
 s5 = s3+s4;
 tf.setText(s5);
 }
 if(e.getSource() == b6) {
 s3 = tf.getText();
 s4 = "6";
 s5 = s3+s4;
 tf.setText(s5);
 }
 if(e.getSource() == b7) {
 s3 = tf.getText();
 s4 = "7";
 s5 = s3+s4;
 tf.setText(s5);
 }
 if(e.getSource() == b8) {
 s3 = tf.getText();
 s4 = "8";
 s5 = s3+s4;
 tf.setText(s5);
 }
 if(e.getSource() == b9) {
 s3 = tf.getText();
 s4 = "9";
 s5 = s3+s4;
 tf.setText(s5);
 }
 if(e.getSource() == bAdd) {
 s1 = tf.getText();
 tf.setText("");
 c="+";
 }
 if(e.getSource() == bSub) {
 s1 = tf.getText();
 tf.setText("");
 c="-";
 }
 if(e.getSource() == bMul) {
 s1 = tf.getText();
 tf.setText("");
 c="*";
 }
 if(e.getSource() == bDiv) {
 s1 = tf.getText();
 tf.setText("");
 c="/";
 }
 if(e.getSource() == bMod) {
 s1 = tf.getText();
 tf.setText("");
 c="%";
 }
 if(e.getSource() == bEquals) {
 s2 = tf.getText();
 switch(c) {
 case "+":
 n = Integer.parseInt(s1) + Integer.parseInt(s2);
 tf.setText(String.valueOf(n));
 break;
 case "-":
 n = Integer.parseInt(s1) - Integer.parseInt(s2);
 tf.setText(String.valueOf(n));
 break;
 case "*":
 n = Integer.parseInt(s1) * Integer.parseInt(s2);
 tf.setText(String.valueOf(n));
 break;
 case "/":
 n = Integer.parseInt(s1) / Integer.parseInt(s2);
 tf.setText(String.valueOf(n));
 break;
 case "%":
 n = Integer.parseInt(s1) % Integer.parseInt(s2);
 tf.setText(String.valueOf(n));
 break;
 }
 }
 if(e.getSource()==bClear) {
 tf.setText("");
 }
 }
 public static void main(String[] args) {
 new calc();
 }
}
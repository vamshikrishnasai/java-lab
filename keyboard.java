// Week 10 - Keyboard Event Handling in Java AWT
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyboard extends Frame implements KeyListener {

    Label l = new Label();
    TextField tf = new TextField();

    keyboard() {
        l.setBounds(20, 50, 100, 30);
        tf.setBounds(20, 80, 200, 30);
        tf.addKeyListener(this);
        
        add(l);
        add(tf);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed");
    }

    public static void main(String[] args) {
        new keyboard();
    }
}
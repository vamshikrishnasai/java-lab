import java.awt.*;
import java.awt.event.*;

public class motion extends Frame implements MouseMotionListener {
    Label l = new Label();

    motion() {
        l.setBounds(20, 50, 500, 20);
        add(l);
        addMouseMotionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse dragging at " + e.getX() + ", " + e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse moving at " + e.getX() + ", " + e.getY());
    }

    public static void main(String[] args) {
        new motion();
    }
}
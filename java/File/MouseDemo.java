import java.awt.*;
import java.awt.event.*;

class MouseDemo extends Frame implements MouseListener, MouseMotionListener {
    Label label;

    public MouseDemo() {
        // Create a label to display mouse events
        label = new Label();
        add(label);

        // Register the mouse listeners
        addMouseListener(this);
        addMouseMotionListener(this);

        setTitle("Mouse Demo");
        setSize(300, 200);
        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked at " + e.getX() + ", " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse entered at " + e.getX() + ", " + e.getY());
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse exited at " + e.getX() + ", " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse pressed at " + e.getX() + ", " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse released at " + e.getX() + ", " + e.getY());
    }

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse dragged at " + e.getX() + ", " + e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse moved at " + e.getX() + ", " + e.getY());
    }

    public static void main(String[] args) {
        new MouseDemo();
    }
}
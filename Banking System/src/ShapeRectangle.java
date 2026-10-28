import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class ShapeRectangle extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Rectangle using Rectangle2D class
        Rectangle2D rect = new Rectangle2D.Double(50, 50, 150, 80);

        g2.setColor(Color.BLUE);
        g2.draw(rect);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Rectangle2D Shape");
        f.add(new ShapeRectangle());
        f.setSize(300, 250);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




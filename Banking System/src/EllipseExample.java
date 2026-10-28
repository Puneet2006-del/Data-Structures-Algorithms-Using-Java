import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class EllipseExample extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Ellipse shape
        Ellipse2D ellipse = new Ellipse2D.Double(50, 50, 200, 120);

        g2.setColor(Color.GREEN);
        g2.fill(ellipse); // filled ellipse
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Ellipse Example");
        f.add(new EllipseExample());
        f.setSize(350, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




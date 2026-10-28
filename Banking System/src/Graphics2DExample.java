import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Graphics2DExample extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Convert Graphics to Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Set color
        g2.setColor(Color.RED);

        // Increase stroke thickness
        g2.setStroke(new BasicStroke(5));

        g2.drawLine(50, 50, 250, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Graphics2D Example");
        f.add(new Graphics2DExample());
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



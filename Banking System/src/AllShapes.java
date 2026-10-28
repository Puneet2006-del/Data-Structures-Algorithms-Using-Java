import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class AllShapes extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Line
        g2.setColor(Color.RED);
        g2.drawLine(50, 20, 250, 20);

        // Rectangle
        g2.setColor(Color.BLUE);
        g2.draw(new Rectangle2D.Double(50, 50, 150, 80));

        // Ellipse
        g2.setColor(Color.GREEN);
        g2.fill(new Ellipse2D.Double(50, 150, 150, 80));

        // Polygon
        int x[] = {50, 150, 250};
        int y[] = {260, 180, 260};
        g2.setColor(Color.MAGENTA);
        g2.drawPolygon(x, y, 3);

        // Text
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Arial", Font.BOLD, 20));
        g2.drawString("All Shapes Example", 50, 300);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("All Shapes Example");
        f.add(new AllShapes());
        f.setSize(350, 350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}







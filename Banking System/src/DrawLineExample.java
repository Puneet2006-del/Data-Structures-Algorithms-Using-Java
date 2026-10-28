import java.awt.*;
import javax.swing.*;

public class DrawLineExample extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set color to Red
        g.setColor(Color.RED);

        // Draw a straight line from (50, 50) to (200, 50)
        g.drawLine(50, 50, 200, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Draw Line Example");
        f.add(new DrawLineExample());
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




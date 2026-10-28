import java.awt.*;
import javax.swing.*;

public class RectangleExample extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 150, 80); // Draw empty rectangle

        g.setColor(Color.GREEN);
        g.fillRect(50, 150, 150, 80); // Draw filled rectangle
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Rectangle Example");
        f.add(new RectangleExample());
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




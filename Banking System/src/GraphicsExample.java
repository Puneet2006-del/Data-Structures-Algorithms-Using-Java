import java.awt.*;
import javax.swing.*;

public class GraphicsExample extends JFrame {

    public GraphicsExample() {
        setTitle("Graphics Example");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.red);
        g.drawLine(50, 50, 200, 50);

        g.setColor(Color.blue);
        g.drawRect(50, 100, 150, 80);

        g.setColor(Color.green);
        g.drawOval(50, 200, 150, 80);

        g.setColor(Color.black);
        g.drawString("Graphics in Java", 80, 330);
    }

    public static void main(String[] args) {
        new GraphicsExample();
    }
}




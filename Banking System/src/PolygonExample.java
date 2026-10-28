import java.awt.*;
import javax.swing.*;

public class PolygonExample extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x[] = {50, 150, 250};
        int y[] = {200, 50, 200};

        Polygon p = new Polygon(x, y, 3); // 3 sides triangle

        g.setColor(Color.ORANGE);
        g.drawPolygon(p);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Polygon Example");
        f.add(new PolygonExample());
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




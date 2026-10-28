import java.awt.*;
import javax.swing.*;

public class TextExample extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set custom font
        Font fnt = new Font("Arial", Font.BOLD, 24);
        g.setFont(fnt);

        g.setColor(Color.MAGENTA);

        // Draw text on screen
        g.drawString("Hello Graphics!", 50, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Text Example");
        f.add(new TextExample());
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



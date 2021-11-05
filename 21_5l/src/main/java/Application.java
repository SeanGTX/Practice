import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {



    Application(){

        super("shapes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(4, 5);
        setLayout(layout);
        for (int i = 0; i < 20; i++) {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            Color color = new Color(r, g, b);
            int w = (int) (Math.random() * 100 + 10);
            int h = (int) (Math.random() * 100 + 10);
            boolean filled = (Math.random() * 255) > 64;

            if(i % 3 == 0)
                add(new Circle(color, filled, 100));
            else if(i % 2 == 0)
                add(new Rectangle(color, h, w, filled));
            else
                add(new Triangle(color, filled, h, w));
        }
        setSize(800, 600);

        setVisible(true);

    }
}

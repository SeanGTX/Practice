import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MagicApp extends JFrame {
    MagicApp(){
        super("Magic");
        AtomicInteger attempts = new AtomicInteger(3);
        int magic = (int) (Math.random() * 20);
        System.out.println(magic);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        JTextField jta = new JTextField(10);
        JButton button = new JButton("Check");



        button.addActionListener(e -> {

            if(Integer.parseInt(jta.getText()) == magic){
                JOptionPane.showMessageDialog(this, "correct!");
                System.exit(0);
            }else{
                if(attempts.get() > 0) {
                    JOptionPane.showMessageDialog(this,
                            "You have " + attempts + " attempts",
                            "InCorrect(",
                            JOptionPane.ERROR_MESSAGE);
                    attempts.getAndDecrement();
                }
                else {
                    JOptionPane.showMessageDialog(this,
                            "You loose!!",
                            ":(((((",
                            JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }

        });
        add(jta);
        add(button);

        setSize(250, 100);
        setResizable(false);
        setVisible(true);
    }
}

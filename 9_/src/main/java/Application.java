import javax.swing.*;
import java.awt.*;
import java.nio.charset.StandardCharsets;


public class Application extends JFrame {

    JTextField name = new JTextField(15);
    JTextField secondName = new JTextField(15);
    JTextField thirdName = new JTextField(15);
    JTextField taxNumber = new JTextField(15);

    JButton buy = new JButton("������");

    Application() {
        super("TAX");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(200, 300);
        setResizable(false);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(new JLabel("���:"));
        add(name);
        add(new JLabel("��������:"));
        add(secondName);
        add(new JLabel("��������:"));
        add(thirdName);
        add(new JLabel("���:"));
        add(taxNumber);

        add(buy);

        buy.addActionListener(e -> {

            if(taxNumber.getText().length() < 11) try {
                throw new BadTaxNameException();
            } catch (BadTaxNameException ex) {
                ex.printStackTrace();
            }

        });

        setVisible(true);
    }

}

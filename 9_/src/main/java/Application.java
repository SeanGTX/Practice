import javax.swing.*;
import java.awt.*;
import java.nio.charset.StandardCharsets;


public class Application extends JFrame {

    JTextField name = new JTextField(15);
    JTextField secondName = new JTextField(15);
    JTextField thirdName = new JTextField(15);
    JTextField taxNumber = new JTextField(15);

    JButton buy = new JButton("Купить");

    Application() {
        super("TAX");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(200, 300);
        setResizable(false);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(new JLabel("Имя:"));
        add(name);
        add(new JLabel("Фаимилия:"));
        add(secondName);
        add(new JLabel("Отчество:"));
        add(thirdName);
        add(new JLabel("ИНН:"));
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

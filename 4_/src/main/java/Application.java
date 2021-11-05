import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Application extends JFrame {

    private int realScore = 0;
    private int milanScore = 0;

    private String lastScoreFormat = "Last Scorer: %s";
    private String winnerFormat = "Winner: %s";
    private String scoreFormat = "Result: %d X %d";

    private JLabel score = new JLabel(String.format(scoreFormat, milanScore, realScore));
    private JLabel lastScore = new JLabel(String.format(lastScoreFormat, "N/A"));
    private JLabel winner = new JLabel(String.format(winnerFormat, ""));


    private Font fnt = new Font("Times new roman",Font.BOLD,20);
    private JButton milanButton = new JButton("AC Milan");
    private JButton realButton = new JButton("Real Madrid");

    private String getWinnerTitle(){
        return (milanScore > realScore) ? milanButton.getText() : realButton.getText();
    }

    Application()
    {
        super("Football");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(300,100);

        add(milanButton);
        add(score);
        add(realButton);
        add(lastScore);
        add(winner);

        milanButton.addActionListener(e -> {
            milanScore++;
            score.setText(String.format(scoreFormat, milanScore, realScore));
            lastScore.setText(String.format(lastScoreFormat, milanButton.getText()));
            winner.setText(String.format(winnerFormat, getWinnerTitle()));
        });

        realButton.addActionListener(e -> {
            realScore++;
            score.setText(String.format(scoreFormat, milanScore, realScore));
            lastScore.setText(String.format(lastScoreFormat, realButton.getText()));
            winner.setText(String.format(winnerFormat, getWinnerTitle()));
        });
        setVisible(true);
    }
}

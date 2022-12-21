package pract5_1;

import javax.swing.*;
import java.awt.*;

public class pract5_1 extends JFrame {
    JButton madridButton = new JButton("Real Madrid");
    JButton milanButton = new JButton("AC Milan");
    static int milanScore = 0;
    static int madridScore = 0;
    static String lastScorerTeam = "N/A";
    static String winner = "DRAW";

    pract5_1(){

        super("Футбольчик");

        JLabel resultLabel = new JLabel("Result: " + madridScore +" X " + milanScore );
        JLabel winnerLabel = new JLabel("Winner: " + winner);
        JLabel lastScorerLabel = new JLabel("Last Scorer: " + lastScorerTeam);
        madridButton.addActionListener(e -> {
            madridScore++;
            lastScorerTeam = "Real Madrid";
            resultLabel.setText("Result: " + madridScore + " X " + milanScore );
            lastScorerLabel.setText("Last Scorer: " + lastScorerTeam);
            if(madridScore > milanScore){
                winner = "Real Madrid";
                winnerLabel.setText("Winner: " + winner);
            } else if(milanScore == madridScore) {
                winner = "DRAW";
                winnerLabel.setText("Winner: " + winner);
            }
        });
        milanButton.addActionListener(e -> {
            milanScore++;
            lastScorerTeam = "AC Milan";
            resultLabel.setText("Result: " + madridScore + " X " + milanScore);
            lastScorerLabel.setText("Last Scorer: " + lastScorerTeam);
            if(milanScore > madridScore){
                winner = "AC Milan";
                winnerLabel.setText("Winner: " + winner);
            } else if(milanScore == madridScore) {
                winner = "DRAW";
                winnerLabel.setText("Winner: " + winner);
            }
        });

        resultLabel.setHorizontalAlignment(0);
        add(madridButton,BorderLayout.PAGE_START);
        add(resultLabel,BorderLayout.CENTER);
        add(milanButton,BorderLayout.PAGE_END);
        add(lastScorerLabel,BorderLayout.LINE_END);
        add(winnerLabel,BorderLayout.LINE_START);
        setSize(600,600);
        setVisible(true);
    }
}

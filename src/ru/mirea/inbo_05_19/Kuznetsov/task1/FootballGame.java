package ru.mirea.inbo_05_19.Kuznetsov.task1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FootballGame extends JFrame {

    private static int madrid=0;
    private static int milan=0;

    private static final String madridName = "Real Madrid";
    private static final String milanName = "AC Milan";

    static JPanel p1 = new JPanel();

    static JButton b1 = new JButton("AC Milan");
    static JButton b2 = new JButton("Real Madrid");

    static Font f1 = new Font("abc",Font.PLAIN,20);

    static JLabel l1 = new JLabel("Result 0 X 0");
    static JLabel l2 = new JLabel("Last Scorer: N/A");
    static Label l3 = new Label("Winner: Draw");

    public static void printWinner(){

        if (FootballGame.madrid>FootballGame.milan) l3.setText("Winner: "+FootballGame.madridName);
        else if (FootballGame.milan>FootballGame.madrid) l3.setText("Winner: "+FootballGame.milanName);
        else l3.setText("Winner: DRAW");

    }
    public static void printScore(){

        l1.setText("Result "+FootballGame.milan+" X "+FootballGame.madrid);

    }
    public FootballGame(){

        super("Football Game");

        setSize(600,200);
        setLayout(new BorderLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(b1,BorderLayout.WEST);
        add(b2,BorderLayout.EAST);

        b1.setFont(f1);
        b2.setFont(f1);
        b1.setPreferredSize(b2.getPreferredSize());

        add(p1,BorderLayout.CENTER);
        p1.setLayout(new GridLayout(3,0));

        p1.add(l1);
        p1.add(l2);
        p1.add(l3);

        l1.setFont(f1);
        l2.setFont(f1);
        l3.setFont(f1);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setVerticalAlignment(SwingConstants.CENTER);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setVerticalAlignment(SwingConstants.CENTER);
        l3.setAlignment(Label.CENTER);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                FootballGame.milan+=1;
                FootballGame.printScore();
                l2.setText("Last Scorer: "+FootballGame.milanName);
                FootballGame.printWinner();

            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                FootballGame.madrid+=1;
                FootballGame.printScore();
                l2.setText("Last Scorer: "+FootballGame.madridName);
                FootballGame.printWinner();

            }
        });
    }
    public static void main (String args[]){
        new FootballGame();
    }
}

package ru.mirea.inbo_05_19.Kuznetsov.example3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextAreaExample extends JFrame {

    JTextArea jta1 = new JTextArea(10,20);
    JButton button = new JButton("Add some Text");
    JScrollPane Scroll = new JScrollPane (jta1);

    public TextAreaExample() {

        super("Example");
        setSize(300,300);
        setLayout(new BorderLayout());

        add(button,BorderLayout.SOUTH);
        add(Scroll,BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                jta1.append(txt);
            }
        }
        );
        setVisible(true);
    }
    public static void main(String[]args) {
        new TextAreaExample();
    }
}
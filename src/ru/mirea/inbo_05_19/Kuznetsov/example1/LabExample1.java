package ru.mirea.inbo_05_19.Kuznetsov.example1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LabExample1 extends JFrame {

    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    LabExample1() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,100);
        add(jta);
        jta.setForeground(Color.PINK);
        jta.setFont(fnt);
        setVisible(true);
    }
    public static void main(String[]args) {
        new LabExample1();
    }
}
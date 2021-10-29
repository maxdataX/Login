package com.company;

import javax.swing.*;
import java.awt.*;

public class Secondwindow {
    private JFrame frame1=new JFrame();
    private JLabel text=new JLabel();
    public Secondwindow(){
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(300,300);
        frame1.setVisible(true);
        frame1.setResizable(false);
        text2();
        add();
    }
    private void text2(){
        text.setText("Bine ati venit !");
        Font font_text=new Font("Arial",Font.BOLD,35);
        text.setFont(font_text);
        text.setSize(50,100);
        Color color1=new Color(0x37C776);
        text.setLocation(50,60);
        text.setBackground(color1);
    }
    private void add(){
        frame1.add(text);
    }
}

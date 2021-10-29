package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Log {
    private JFrame frame=new JFrame();
    private JLabel username=new JLabel();
    private JLabel password=new JLabel();
    private JTextField username1=new JTextField();
    private JPasswordField password1=new JPasswordField();
    private JButton login=new JButton();
    public Log() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        Color color1=new Color(0x7E0CE811, true);
        Color color2=new Color(0x17DBAC);
        Color color3=new Color(0x6862E391, true);
        username.setSize(100,30);
        username.setLocation(80,10);
        username.setText("Username:");
        password.setSize(100,30);
        password.setText("Password:");
        password.setLocation(80,50);
        password.setBackground(color2);
//        login.addActionListener((ActionListener) this);
        createbtn();
        addobject();
        createtext();
        createpasword();


        Actiuni();
    }
    private void Actiuni(){
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String nume=username1.getText();
                String parola=password1.getText();
                if(nume.trim().equals("admin") && parola.trim().equals("admin")){
//                    JOptionPane.showMessageDialog(frame,"Bine ati venit");
                    new Calculator();
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Datele nu sunt corecte");

                }
            }
        });
    }

    private void createtext(){
        Color color=new Color(0xE23B97);
        username1.setSize(150,20);
        username1.setColumns(20);
        username1.setLocation(150,20);
        username1.setBackground(color);
    }
    private void createpasword(){
        Color color= new Color(0x88CD37);
        password1.setSize(150,20);
        password1.setLocation(150,55);
        password1.setColumns(20);
        password1.setBackground(color);
    }
    private void addobject() {
        frame.add(username);
        frame.add(password);
        frame.add(username1);
        frame.add(password1);
        frame.add(login);
    }
    private void createbtn(){
        login.setSize(100,30);
        login.setLocation(140,100);
        login.setText("Login");
    }
    private void actionPerformed(ActionEvent e){

    }
}

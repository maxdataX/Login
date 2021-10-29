package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame = new JFrame("Calculator");
    private JTextArea text=new JTextArea();
    private JTextArea text1=new JTextArea();
    private JButton btn1=new JButton("0");
    private JButton btn2=new JButton("1");
    private JButton btn3=new JButton("2");
    private JButton btn4=new JButton("3");
    private JButton btn5=new JButton("4");
    private JButton btn6=new JButton("5");
    private JButton btn7=new JButton("6");
    private JButton btn8=new JButton("7");
    private JButton btn9=new JButton("8");
    private JButton btn10=new JButton("9");


    private JButton divide=new JButton("/");
    private JButton inmultire=new JButton("*");
    private JButton adunare=new JButton("+");
    private JButton scadere=new JButton("-");
    private JButton putere=new JButton("^2");
    private JButton radical=new JButton("sqrt");
    private JButton clr=new JButton("CLR");
    private JButton pdr=new JButton("(");
    private JButton pst=new JButton(")");
    private JButton back=new JButton("<-");
    private JButton egal=new JButton("=");
    public Calculator()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setResizable(false);
        frame.setLayout(null);
        Color customColor1=new Color(19, 227, 19);
        Color customColor2=new Color(0xDBE811);
        frame.getContentPane().setBackground(customColor1);
        text.setSize(580, 50);
        text.setLocation(7, 5);
        text1.setSize(580, 50);
        text1.setLocation(7, 70);
        text1.setBackground(customColor2);
        egal.setSize(100, 50);
        egal.setLocation(270, 450);
        egal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x=Evaluation.eval(text.getText());
                    if(x==(1.0/0.0)|| x==(-1.0/0.0)|| x==(0.0/0.0)){
                    System.out.println("Nu este posibila impartirea cu 0");
                    JOptionPane.showMessageDialog(frame,"Nu se poate realiza impartirea la 0","Erroare",JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        text1.setText(Double.toString(x));
                        System.out.println(x);
                    }

                } catch (Exception e1) {
//                    text1.setText("Intrare invalida,Incercati din nou");
                    JOptionPane.showMessageDialog(frame,"Datele introduse nu corespund.Numai cifre","Error",JOptionPane.ERROR_MESSAGE);
                    text1.append("\n"+e1.getMessage());
                    e1.printStackTrace();
                }
            }

        });
        createbtn();
       createActionListeners();
        addObjectstoScreen();
        frame.setVisible(true);

    }
    private void addObjectstoScreen(){
        frame.add(text);
        frame.add(text1);
        frame.add(clr);
        frame.add(egal);
        frame.add(adunare);
        frame.add(divide);
        frame.add(inmultire);
        frame.add(putere);
        frame.add(radical);
        frame.add(back);
        frame.add(pdr);
        frame.add(pst);
        frame.add(scadere);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btn10);
    }
    private void createbtn(){
        btn1.setSize(100,50);
        btn1.setLocation(170,300);
        btn2.setSize(100,50);
        btn2.setLocation(170,450);
        btn3.setSize(100,50);
        btn3.setLocation(70,450);
        btn4.setSize(100,50);
        btn4.setLocation(270,400);
        btn5.setSize(100,50);
        btn5.setLocation(170,400);
        btn6.setSize(100,50);
        btn6.setLocation(70,400);
        btn7.setSize(100,50);
        btn7.setLocation(270,350);
        btn8.setLocation(170,350);
        btn8.setSize(100,50);
        btn9.setSize(100,50);
        btn9.setLocation(70,350);
        btn10.setSize(100,50);
        btn10.setLocation(270,300);
        clr.setSize(100,50);
        clr.setLocation(70,300);
        divide.setSize(100,50);
        divide.setLocation(270,220);
        adunare.setSize(100,50);
        adunare.setLocation(170,220);
        inmultire.setSize(100,50);
        inmultire.setLocation(70,220);
        scadere.setSize(100,50);
        scadere.setLocation(270,170);
        putere.setSize(100,50);
        putere.setLocation(170,170);
        radical.setSize(100,50);
        radical.setLocation(70,170);
        pdr.setSize(50,50);
        pdr.setLocation(9,170);
        pst.setSize(50,50);
        pst.setLocation(9,220);
        back.setSize(50,50);
        back.setLocation(9,300);
    }
    private void createActionListeners(){
        btn10.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){

               text.append("9");
           }
        });
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.append("8");
            }
        });
        btn8.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
               text.append("7");
           }
        });
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("6");
            }
        });
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("5");
            }
        });
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("4");
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("3");
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("2");
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("1");
            }
        });
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("0");
            }
        });
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("/");
            }
        });
        adunare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("+");
            }
        });
        scadere.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("-");
            }
        });
        inmultire.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("*");
            }
        });
        radical.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("sqrt");
            }
        });
        clr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
//                if(text.getText().length() !=0){
//                    String text4=text.getText().substring(0,text.getText().length()-100);
//                    text.setText(text4);
//                }
                text.setText(null);
            }
        });
        pdr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append("(");
            }
        });
        pst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text.append(")");
            }
        });
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               if(text.getText().length() !=0){
                   String text3=text.getText().substring(0,text.getText().length()-1);
                   text.setText(text3);
               }
               else{
//                   text1.setText("There is nothing to remove");
                   JOptionPane.showMessageDialog(frame,"Nu mai este nimica de sters","O mica eroare",JOptionPane.ERROR_MESSAGE);
               }
            }
        });
    }


}

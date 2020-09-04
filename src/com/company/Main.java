package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

    JPanel panel = new JPanel();
    JPanel p = new JPanel();
    JPanel name = new JPanel();

    Font font = new Font("Times new roman",Font.BOLD,80);

    Label l = new Label("Madrid");
    Label m = new Label("Milan");

    Label space = new Label("                                        ");

     JTextArea textAreaMilan = new JTextArea( 30, 11);
     JTextArea textAreaMadrid = new JTextArea(30,11);

     int countMadrid = 1;
     int countMilan = 1;

     JButton buttonMilan = new JButton(" Add point Milan ");
     JButton buttonMadrid = new JButton("Add point Madrid");
     JButton buttonEnd = new JButton(" Match result");

     public Main()
     {


         super("Main");
         setSize(1920,1080);

         setLayout(new FlowLayout(FlowLayout.CENTER));
         setLayout(new GridLayout(3,1));
         add(name);
         add(p);
         add(panel);
         p.setLayout(new BorderLayout());
         panel.setLayout(new BorderLayout());

         name.add(l,BorderLayout.WEST);
         l.setFont(font);
         p.add(textAreaMadrid,BorderLayout.WEST);
         textAreaMadrid.setFont(font);

         name.add(space,BorderLayout.CENTER);
         space.setFont(font);

         name.add(m,BorderLayout.EAST);
         m.setFont(font);
         p.add(textAreaMilan,BorderLayout.EAST);
         textAreaMilan.setFont(font);

         panel.add(buttonMadrid,BorderLayout.WEST);
         panel.add(buttonMilan,BorderLayout.EAST);
         panel.add(buttonEnd,BorderLayout.CENTER);



        buttonMadrid.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {



                textAreaMadrid.setText(String.valueOf(countMadrid++));
            }
        });

         buttonMilan.addActionListener(new AbstractAction() {
             @Override
             public void actionPerformed(ActionEvent e) {



                 textAreaMilan.setText(String.valueOf(countMilan++));
             }
         });



             buttonEnd.addActionListener(new AbstractAction() {

                 public void actionPerformed(ActionEvent e) {
                     if(countMadrid>countMilan)
                     {
                         JOptionPane.showMessageDialog(null, "Madrid is winner !! with " + (countMadrid - 1) + "point");
                     }
                     else if (countMilan == countMadrid)
                     {
                         JOptionPane.showMessageDialog(null, "the match ended in a draw with the score :" + (countMadrid - 1));
                     }
                     else
                     {
                         JOptionPane.showMessageDialog(null, "Milan is winner !! with " + (countMilan - 1) + "point");
                     }
                 }
             });











         setVisible(true);
     }

    public static void main(String[] args) {
        new Main();
    }
}

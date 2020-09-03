package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

    JPanel panel = new JPanel();


     JTextArea textAreaMilan = new JTextArea( 1, 1);
     JTextArea textAreaMadrid = new JTextArea(1,1);

     int countMadrid = 1;
     int countMilan = 1;

     JButton buttonMilan = new JButton("Add point Milan");
     JButton buttonMadrid = new JButton("Add point Madrid");
     JButton buttonEnd = new JButton(" Match result");

     public Main()
     {


         super("Main");
         setSize(400,300);

         setLayout(new FlowLayout(FlowLayout.CENTER));
         add(panel);
         //panel.setLayout(new BorderLayout());
         panel.add(new Label("Madrid"),BorderLayout.WEST);
         panel.add(textAreaMadrid,BorderLayout.WEST);
         panel.add(new Label("Milan"),BorderLayout.EAST);
         panel.add(textAreaMilan,BorderLayout.EAST);
         panel.add(buttonMadrid,BorderLayout.WEST);
         panel.add(buttonMilan,BorderLayout.EAST);
         panel.add(buttonEnd,BorderLayout.SOUTH);



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

package com.company.Swing.LayoutManagers;

import javax.swing.*;
import java.awt.*;

public class SwingBorder {

    public static class SwingBorderLayoutDemo extends JFrame{
        private JButton btnNorth, btnSouth, btnCenter, btnEast,btnWest;


        public SwingBorderLayoutDemo(){
            setLayout(new BorderLayout(3,3));



            btnNorth = new JButton("NORTH");
            add(btnNorth,BorderLayout.NORTH);
            btnSouth = new JButton("SOUTH");
            add(btnSouth,BorderLayout.SOUTH);
            btnCenter = new JButton("CENTER");
            add(btnCenter,BorderLayout.CENTER);
            btnEast = new JButton("EAST");
            add(btnEast,BorderLayout.EAST);
            btnWest = new JButton("WEST");
            add(btnWest,BorderLayout.WEST);


            setTitle("Border Layout Demo");
            setSize(200,150);
            setVisible(true);

        }
    }

    public static void main(String[] args) {

        new SwingBorderLayoutDemo();

    }
}

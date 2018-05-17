package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame  = new JFrame();
        JButton helloButton = new JButton("Say Hello");
        JButton goodbyeButton = new JButton("Say Goodbye");
        final  int FIELD_WIDTH = 20;
        JTextField textField = new JTextField(FIELD_WIDTH);

        textField.setText("Click a Button");
        frame.setLayout( new FlowLayout());
        frame.add(helloButton);
        frame.add(goodbyeButton);
        frame.add(textField);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
	// write your code here
    }
}

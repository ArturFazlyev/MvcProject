package view;

import controller.Controller;
import model.Model;

import javax.swing.*;
import java.awt.*;

public class UserView extends JFrame {
    private JTextArea text;
    private JButton sendButton;
    private JLabel info;
    private Controller controller;

    public UserView(Controller controller) {
        this.controller = controller;
    }

    public void init() {
        setSize(400, 300);
        text = new JTextArea();
        sendButton = new JButton("Send");
        info = new JLabel("Info");
        add(text, BorderLayout.CENTER);
        add(sendButton, BorderLayout.SOUTH);
        add(info, BorderLayout.NORTH);
        sendButton.addActionListener(e -> {
            String textPin = this.text.getText();
            int pin = Integer.parseInt(textPin);
            info.setText("Got it " + pin);

            controller.checkPin(pin);

        });
        setVisible(true);
    }
}


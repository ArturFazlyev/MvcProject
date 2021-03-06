package main;

import controller.Controller;
import model.Model;
import view.UserView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UserView userView = new UserView(new Controller(new Model()));
        SwingUtilities.invokeLater(userView::init);
    }
}

package com.zmash;

import javax.swing.*;

class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainMenu mainMenu = new MainMenu();
                MainWindow main = new MainWindow(MainMenu.getFrame());
                main.start();
            }
        });
    }
}
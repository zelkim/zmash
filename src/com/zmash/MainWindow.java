package com.zmash;

import javax.swing.*;

public class MainWindow {

    private JFrame window;

    public MainWindow(JPanel panel) {
        init();
        window.add(panel);
    }

    public void init() {
        window = new JFrame();
        window.setTitle(AppTheme.title);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(AppTheme.appWidth, AppTheme.appHeight);
        window.setLocationRelativeTo(null);
    }

    public void start() {
        window.setVisible(true);
    }
}

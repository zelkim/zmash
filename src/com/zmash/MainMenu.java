package com.zmash;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainMenu {
    final private static JPanel panel = new JPanel();
    private ArrayList<MainMenuButton> MainMenuItems = new ArrayList<MainMenuButton>();

    public MainMenu() {
        init();
    }

    public void init() {
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(AppTheme.backgroundColor);
    }

    public static JPanel getFrame() {
        return panel;
    }

    public void addMainMenuItem(MainMenuButton button) {
        MainMenuItems.add(button);
    }
}

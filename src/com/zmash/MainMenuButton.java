package com.zmash;
import javax.swing.*;

public class MainMenuButton {
    final private static JButton button = new JButton();

    public MainMenuButton(String text) {
        init(text);
    }

    public void init(String text) {
        button.setText(text);
        button.setFont(AppTheme.font);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }

    public JButton getButton() {
        return button;
    }


}

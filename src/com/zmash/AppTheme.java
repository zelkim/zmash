package com.zmash;

import java.awt.*;

public class AppTheme {
    final static String title = "zmash - keyboard game";
    final static Color backgroundColor = Color.decode("#1fde86");
    final static int appWidth = 1280;
    final static int appHeight = 720;
    final static Font font = Font.getFont("JetBrains Mono");

    public static int getFrameCenterHeight()
    {
        return (appWidth / 2) + 1;
    }
    public static int getFrameCenterWidth() {
        return (appHeight / 2) + 1;
    }
}
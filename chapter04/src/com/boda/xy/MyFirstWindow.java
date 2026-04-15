package com.boda.xy;
import javax.swing.*;

public class MyFirstWindow {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        myWindow.setSize(400,300);
        myWindow.setTitle("我的第一个程序");
        JButton button = new JButton("确定");
        myWindow.add(button);
        myWindow.setVisible(true);
    }
}

// javax.swing      JFrame
// JFrame(),JFrame(String title)
// setSize(int width, int height)
// setTitle(String title)
// setVisible(boolean b)

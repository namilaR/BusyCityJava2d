package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Busy City Using Java 2d");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Main ex = new Main();
                ex.setVisible(true);
            }
        });
    }
}

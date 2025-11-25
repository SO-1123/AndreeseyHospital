package com.hospital.ui;
import java.awt.*;
import javax.swing.*;

public abstract class SensorPanel extends JPanel {
    protected JLabel dataLabel;

    public SensorPanel(String title) {
        setLayout(new BorderLayout());
        dataLabel = new JLabel();
        add(dataLabel, BorderLayout.CENTER);
    }

    public abstract void updateDispalay();

}



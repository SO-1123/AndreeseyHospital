package com.hospital.main;
import com.hospital.ui.MonitoringFrame;
import javax.swing.SwingUtilities;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MonitoringFrame frame = new MonitoringFrame();
            frame.setVisible(true);
        });
    }
}

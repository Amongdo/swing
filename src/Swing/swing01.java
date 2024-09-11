package Swing;

import javax.swing.*;

public class swing01 {
    public static void main(String[] args) {
        //TODO Auto-generated method stub

        JFrame MainFrame = new JFrame();
        JButton btn = new JButton("Click me");
        btn.setSize(70, 70);
        btn.setLocation(70,70);
        MainFrame.setTitle("Swing Practice");
        MainFrame.setSize( 200, 200);
        MainFrame.setVisible(true);

    }
}

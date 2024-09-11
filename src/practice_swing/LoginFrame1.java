package practice_swing;



import weavus.RegisterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LoginFrame1 extends JFrame {

    //프레임셋팅
    public LoginFrame1() {
        setSize(500,500);
        setTitle("이것은 연습");
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        JPanel p1 =new JPanel();
        JLabel l1 = new JLabel("title");
        JTextField t1 = new JTextField(10);

        p1.add(l1);
        p1.add(t1);
        add(p1);
        //
        JPanel p2 =new JPanel();
        JLabel l2 = new JLabel("password");
        JPasswordField t2 = new JPasswordField(10);

        p1.add(l2);
        p1.add(t2);
        add(p2);
        //

        JPanel p3 = new JPanel();
        JButton b1 = new JButton("login");
        JButton b2 = new JButton("password");

        p3.add(b1);
        p3.add(b2);
        add(p3);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = t1.getText();
                String password = new String(t2.getPassword());

                File file = new File("./src/File", "test.csv");

                try {
                    FileReader reader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(reader);

                    String line = "";
                    boolean isLogin = false;

                    while ((line = bufferedReader.readLine()) !=null) {
                        String[] strArr = line.split(",");

                        if (id.equals(strArr[0]) && password.equals(strArr[1])) {
                            isLogin = true;
                            break;
                        }
                    }

                    if (isLogin) {
                        JOptionPane.showMessageDialog(null, "login pass");
                        dispose();
                        new RegisterFrame();
                    } else {
                        JOptionPane.showMessageDialog(null, "login fail");
                    }






                } catch (Exception e1) {
                    e1.printStackTrace();
                    System.out.println("error");
                }


            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new RegisterFrame();
            }
        });








        setVisible(true);





    }

    public static void main(String[] args) {
        new LoginFrame1();
    }


}

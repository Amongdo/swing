package weavus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class RegisterFrame extends JFrame {
    public RegisterFrame() {
        setSize(500,500);
        setTitle("what");
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1));
        //레이아웃이 5,1인 이유는 밑에 4가지 + 버튼 표시때문.
        //아이디 이름 패스워드 패스워드 체크 만들기
        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("ID");
        JTextField t1 = new JTextField(10);

        p1.add(l1);
        p1.add(t1);

        JPanel p2 = new JPanel();
        JLabel l2 = new JLabel("Name");
        JTextField t2 = new JTextField(10);

        p2.add(l2);
        p2.add(t2);

        JPanel p3 = new JPanel();
        JLabel l3 = new JLabel("password");
        JPasswordField t3 = new JPasswordField(10);

        p3.add(l3);
        p3.add(t3);

        JPanel p4 = new JPanel();
        JLabel l4 = new JLabel("password field");
        JPasswordField t4 = new JPasswordField(10);

        p4.add(l4);
        p4.add(t4);

        JPanel p5 = new JPanel();
        JButton b1 = new JButton("register");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //각종체크를 넣어야댐
                String id = t1.getText();
                String name = t2.getText();
                String password = new String(t3.getPassword());
                String passwordCheck = new String(t4.getPassword());

                try {
                    File file = new File("./src/file", "test.csv");

                    //파라메터 복습
                    FileWriter writer = new FileWriter(file, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(writer);

                    bufferedWriter.write(id + "," + password + ","+ name);
                    bufferedWriter.newLine();
                    bufferedWriter.close();

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                //파일라이터 등장
                //라이터나 리드할때 덮어쓰기 밀어쓰기 배워두기..중요 true 듸에 쓰기
                //newline();
            }
        });

        p5.add(b1);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);




        setVisible(true);

    }
    // test
//    public static void main(String[] args) {
//        new RegisterFrame();
//    }

}

package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TodoRegisterFrame extends JFrame {

    private MainFrame mainFrame;

    public TodoRegisterFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;  // MainFrame 인스턴스 전달
        setSize(300, 100);
        setTitle("TODO 등록");
        setLocationRelativeTo(null);

        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("TODO");
        JTextField t1 = new JTextField(10);
        JButton b1 = new JButton("등록");
        p1.add(l1);
        p1.add(t1);
        p1.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String content = t1.getText();

                    // CSV 파일에 내용 저장
                    File file = new File("./src/File", "TodoList.csv");
                    FileWriter writer = new FileWriter(file, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(writer);

                    bufferedWriter.write(content);
                    bufferedWriter.newLine();
                    bufferedWriter.close();

                    // MainFrame 새로고침 호출
                    mainFrame.refreshTodoList();

                    dispose();

                } catch (IOException e1) {
                    throw new RuntimeException(e1);
                }
            }
        });

        add(p1);
        setVisible(true);
    }
}

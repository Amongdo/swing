package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainFrame extends JFrame {
    JPanel p2;

    public MainFrame() {
        setSize(500, 500);
        setTitle("Main");
        setLocationRelativeTo(null);
        List<String> list = new ArrayList<>();
        setLayout(new BorderLayout());

        // 상단 패널
        JPanel p1 = new JPanel(new GridLayout(1, 2));
        Date now = new Date();
        String yyyyMM = new SimpleDateFormat("yyyy-MM").format(now);
        JLabel l1 = new JLabel("현재날짜" + yyyyMM);
        JButton b1 = new JButton("todo등록");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    new TodoRegisterFrame(MainFrame.this);  // MainFrame 인스턴스 전달
            }
        });

        p1.add(l1);
        p1.add(b1);

        // 중앙 패널 (스크롤 가능한 TODO 리스트)
        p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));

        JScrollPane sp = new JScrollPane(p2);

        // 할 일 리스트 불러오기
        refreshTodoList();

        // 하단 패널 (필요하면 추가 가능)
        JPanel p3 = new JPanel();

        // 프레임에 컴포넌트 추가
        add(p1, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

        setVisible(true);
    }

    // 할 일 리스트 갱신 메서드
    public void refreshTodoList() {
        p2.removeAll();  // 기존 버튼 제거

        try {
            File file = new File("./src/File", "TodoList.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            List<String> list = new ArrayList<>();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }

            for (String label : list) {
                JButton button = new JButton(label);
                button.setHorizontalAlignment(SwingConstants.LEFT);
                button.setPreferredSize(new Dimension(p2.getParent().getWidth(), 40));
                button.setMaximumSize(new Dimension(p2.getParent().getWidth(), 40));
                button.setAlignmentX(Component.CENTER_ALIGNMENT);
                p2.add(button);
                p2.add(Box.createRigidArea(new Dimension(0, 10)));

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        button.setBackground(Color.DARK_GRAY);
                        button.setOpaque(true);
                    }
                });
            }

            bufferedReader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        p2.revalidate();
        p2.repaint();
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}

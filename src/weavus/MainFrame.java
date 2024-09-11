package weavus;

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

    public MainFrame() {

        setSize(500, 500);
        setTitle("Main");
        setLocationRelativeTo(null);
        List<String> list = new ArrayList<>();
        //Todolist

        setLayout(new BorderLayout());

        //data 사용해서 날짜 취득
        JPanel p1 = new JPanel(new GridLayout(1, 2));
        Date now = new Date();
        String yyyyMM = new SimpleDateFormat("yyyy-MM").format(now);

        JLabel l1  = new JLabel("현재날짜" + yyyyMM);
        JButton b1 = new JButton("todo등록");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TodoRegisterFrame();

            }
        });

        p1.add(l1);
        p1.add(b1);

        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));

        JScrollPane sp = new JScrollPane(p2);
        try {
            File file = new File("./src/File", "TodoList.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = "";

            while((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }

            for (String label : list) {
                JButton button = new JButton(label);
                button.setHorizontalAlignment(SwingConstants.LEFT);
                button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));// 배열 요소를 버튼에 사용
                button.setAlignmentX(Component.CENTER_ALIGNMENT);
                p2.add(button);
                p2.add(Box.createRigidArea(new Dimension(0, 10)));

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        button.setBackground(Color.DARK_GRAY);
                    }
                });
                // JFrame에 버튼 추가
                bufferedReader.close();
            }

        } catch (Exception e) {
            System.out.println("111");
        }

        JPanel p3 = new JPanel();
        JButton b2 = new JButton("새로고침");

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                File file = new File("./src/File", "TodoList.csv");
                try {
                    FileReader reader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    list.clear();
                    String line = "";

                    while((line = bufferedReader.readLine()) != null) {

                        list.add(line);
                        p2.removeAll();
                    }
                    for (String label : list) {
                        JButton button = new JButton(label);
                        button.setHorizontalAlignment(SwingConstants.LEFT);
                        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));// 배열 요소를 버튼에 사용
                        button.setAlignmentX(Component.CENTER_ALIGNMENT);
                        p2.add(button);
                        p2.add(Box.createRigidArea(new Dimension(0, 10)));
                        // JFrame에 버튼 추가
                        bufferedReader.close();
                    }


                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                p2.revalidate();
                p2.repaint();
            }
        });

        p3.add(b2);


        add(p1, BorderLayout.NORTH);
//        add(p2);
        add(sp, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

        setVisible(true);

    }

    public static void main(String[] args) {

        new MainFrame();
    }


}

//숙제. 투두리스트를 만들어서 p3에 새로운 리스트만들기.. 색깔 꼭 바꾸기(할일과 한일을 구분!)
//여유 있으면 투두 CSV파일 만들어서 투두 등록했을때 파일에 연동되도록!해보기
package homework_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class TimeTable extends JFrame {
    long sum;
    long salary;

    public TimeTable() {
        setSize(500, 500);
        setTitle("Time");
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        final int ONE_HOUR_BY_MIN = 60;

        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        p1.setBorder(BorderFactory.createEmptyBorder(150, 150, 150, 150));

        JButton b1 = new JButton("시급 계산하기");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("./src/File", "WorkingResult.csv");
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    List<String> list = new ArrayList<>();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        list.add(line);
                    }

                    for (String rain : list) {
                        String[] strArr = rain.split(",");

                        // 시간 계산
                        LocalTime startTime = LocalTime.parse(strArr[1]);
                        LocalTime finishTime = LocalTime.parse(strArr[2]);
                        long workingTime = ChronoUnit.MINUTES.between(startTime, finishTime); // 분 단위 차이 계산

                        // 시간과 분으로 나누기
                        int workingHour = (int) (workingTime / ONE_HOUR_BY_MIN);  // 시간을 구함
                        int workingMin = (int) (workingTime % ONE_HOUR_BY_MIN);   // 남은 분 계산

                        // 시급 계산 로직
                        if (workingHour > 6 && workingHour <= 8) {
                            workingMin -= 45; // 휴식 시간 45분 빼기
                            if (workingMin < 0) workingMin = 0; // 음수 방지
                            salary = (int)(900 * (workingHour + workingMin / 60.0)); // 시급 계산
                        } else if (workingHour > 8) {
                            salary = 900 * (workingHour-1) + (int)((900 * 1.25) * workingMin / 60.0); // 추가 수당
                        } else {
                            salary = (int)(900 * (workingHour + (workingMin / 60.0))); // 기본 시급 계산
                        }

                        sum += salary; // 총합 계산
                    }

                    System.out.println("총 시급: " + sum);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        p1.add(b1);
        this.add(p1, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TimeTable();
    }
}

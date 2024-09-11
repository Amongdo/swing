package homework_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        //학생 인스턴스 생성
//        Student st1 = new Student("유재석", 100032);
//        st1.setScores(80, 80, 80);

//        Student st2 = new Student("강호동", 200022);
//        st2.setScores(90, 90, 90);

//        Student st3 = new Student("탁재훈", 300032);
//        st3.setScores(99, 99, 99);

        //스캐너 이용으로 3명 학생 정보 입력하기
        Scanner sc = new Scanner(System.in);

        //학생 리스트 생성
        List<Student> lists = new ArrayList<>();
        //리스트에 학생 정보 추가

        for (int i = 0; i < 3; i++) {
            System.out.println("추가할 학생이름은?");
            String name = sc.nextLine();


            System.out.println("학생번호눈?");
            int studentId = sc.nextInt();
            sc.nextLine();

            System.out.println("수학,과학,영어 점수를 순서대로 입력하시오");
            int mathScore = sc.nextInt();
            int scienceScore = sc.nextInt();
            int englishScore = sc.nextInt();
            sc.nextLine();

            Student student = new Student(name, studentId);
            student.setScores(mathScore, scienceScore, englishScore);
            lists.add(student);
        }


        //가장 점수 높은 학생 변수 생성.(센스필요).get()은 리스트정보 불러오고 괄호 안은 인덱스 번호!
        Student top = lists.get(0);

        //for 반복문으로 학생정보 출력.
        for (Student list : lists) {
            list.printStudentInfo();
            System.out.println("-----------");
            // 위에서 만든 변수 이용해서 가장 평균 점수가 높은 리스트 골라내기.
            // top = list; 를 해주므로써 탑 평균점수 보유자를 계속 갱신
            if (list.getAverage() > top.getAverage()) {
                top = list;
            }
        }
        // 프린트 출력이 for문 안에 넣어버리는 바람에 2번째 회전에서 계속 끊겼던 것..주의
        System.out.println("가장 평균 점수가 높은 학생은 " + top.name + "입니다");

        }

    }

//인터넷도움받아서 2시간 40분 ....흠.시행착오가 좀 많았음
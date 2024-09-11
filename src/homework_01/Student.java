package homework_01;

public class Student {
    //기본 변수 생성
    String name;
    int studentId;
    int mathScore;
    int scienceScore;
    int englishScore;

    //클래스 이름,학번 셋팅
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    //과목점수 입력받아 설정하는 메소드
    public void setScores(int mathScore, int scienceScore, int englishScore) {
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
    }

    //과목 점수 평균내서 리턴하는 메소드
    public double getAverage() {
        double x = (mathScore + scienceScore + englishScore) / 3;
        return x ;
    }

    //입력값 깔끔하게 출력하게 해주는 메소드
    public void printStudentInfo() {

        System.out.println("학생: " + name + ", 학번: " + studentId);
        System.out.println("수학: " + mathScore + ", 과학: " + scienceScore + ", 영어: " + englishScore );
        System.out.println("평균 점수: " + getAverage());
    }
}
// this의 쓰임새 아직 잘 이해못했으나 일단 사용함.
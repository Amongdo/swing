package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "안병도";
        int hour = 15;

        System.out.println(name + "nim,"+ hour +"배송시작");
        System.out.println(name + "nim,배송완료");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.14123123;
        float f = 3.11231232134F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l;
        l = 1_000_000_000_000l;
        System.out.println(l);











    }
}

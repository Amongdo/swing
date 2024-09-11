package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and", ","));
        //" and"를 ","로 변환
        System.out.println(s.substring(7)); //인덱스 기준 7부터 시작 (이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));

        //뒤에서 끝는 법
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));
        //뒷 부분의 . 을 쓴 이유는, . 앞부분까지만 화면에 뜸

        //공백제거

        s = "      I love Java.         ";
        System.out.println(s.trim()); //앞 뒤 공백 제거해줌

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));






    }
}

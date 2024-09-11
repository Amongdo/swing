package chap_03;

import java.sql.SQLOutput;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); //문자열이 같으면 트루, 다르면 폴스
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python")); //대소문자를 구분하므로 이것도 폴스가 뜸

        System.out.println(s2.equalsIgnoreCase("python"));
        //위건 대소문자 구분없이 문자열을 비교해줌.

        //문자열 비교 심화

        s1 = "1234"; //벽에 붙은 비밀번호 정보
        s2 = "1234";
        //위와 같은 경우는, 먼저 s1의 정보를 s2가 참조하는 것.
        // 그래서 두 값이 같다고 뜨는 것이다
        System.out.println(s1.equals(s2)); //true (내용 비교)
        System.out.println(s1 == s2); //true (참조 비교)

        s1 = new String("1234");
        s2 = new String("1234");
        // 위와 같은 경우는, 각각의 데이타가 독립적으로 존재. 참조 ㄴㄴ
        //즉, 벽에 붙인 공유 메모가 아니라, 각각의 테이블에 같은 내용의 메모지를
        //배포한 것
        System.out.println(s1.equals(s2));  //true. (내용은 같으므로)
        System.out.println(s1 == s2); //false?!(서로 참조하지 않았으므로)

        //그래서 되도록이면 무언갈 비교할 때, == 공식을 쓰는게 아니라, equals를
        //써야한다는 점이 포인트





    }
}

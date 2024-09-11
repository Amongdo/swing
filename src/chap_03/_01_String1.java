package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length()); //29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        //포함 관계
        System.out.println(s.contains("Java")); //포함된다면 트루/ 포함되지 않으면 폴스
        System.out.println(s.indexOf("Java")); //위치 정보 7
        //위치정보에서 첫 글자는 0으로 시작. 즉 I like 의 I는 0번째.
        System.out.println(s.indexOf("C#")); //포함되지 않는 단어는 -1로 표시됨.
        System.out.println(s.indexOf("and")); // and가 처음으로 발견되는 숫작자가 뜸. 12
        System.out.println(s.lastIndexOf("and")); //마지막 and . 위치 정보 23
        System.out.println(s.startsWith("I like"));  // 이 문자열로 시작하면 트루, 아니면 폴스
        System.out.println(s.endsWith(".")); //이 문자열로 끝나면 트루 ,아니면 폴스









    }
}

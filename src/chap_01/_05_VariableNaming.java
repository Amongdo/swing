package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        //1.저장할 값에 어울리는 이름
        //2.밑줄, 문자, 숫자 사용 가능(공백 사용 불가)
        //3.밑줄 혹은 문자로 시작 가능
        //4.한 단어 혹은 2개 이상의 단어의 연속
        //5.소문자로 시작, 각 단어의 글자는 대문자(첫 단어 제외)
        //6.예약어 사용 불가(public, static...)

        //입국 신고서(여행)
        String nationality = "대한민국"; // 국적
        String fistName = "Byungdo"; //이름
        String lastName = "Ahn"; //성
        String dateOfBirth = "2020-01-01"; //생년월일
        String redidentialAdress = "병도 호텔"; // 체류지
        String purposeOfVisit = "관공"; //입국목적
        String flightNumber = "KE648"; //항공 편명
        String flight_no_2 = "KE999"; //밑줄

        int accompany = 2; //동반가족수
        int lengthOfStay = 5; //체류 기간

        String item1 = "시계";
        String item2 = "가방";
        //String 3item = "가발";


        //절대 변하지 않는 상수는 대문자로 정함
        final String CODE= "케이알";


    }
}

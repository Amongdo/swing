package chap_06;

public class _Quiz_06 {

    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index); //나코딩일떄>>나**
        // for (int i = index; i < data.length() ; i ++)
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*"; //나**
        }
        return hiddenData;
    }
        //substring() 메소드를 이용하면 문자열의 일부를 가릴 수 있음
        // length() 메소드를 이용하면 문자열의 길이를 알 수 있음
    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }

}

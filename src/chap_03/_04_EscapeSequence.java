package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (EscapeSequence, EscapeCharacter)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요.");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요.");

        //해물파전 9000원, 김치전 8000원, 부추전 8000원

        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");


        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");
        //   \
        // 역슬래쉬를 한 번만 하면, 그 뒤에 기능을 입력해야만 해서 오류발생
        //그래서 역슬래쉬를 2번 입력함
        System.out.println("c:\\Program Files\\Java");

        //단비가 "냐용"이라고 했어요 라는 문장 출력

        //System.out.println("단비가 "냐용"이라고 했어요");
        //위와 경우면 ""문장에 다른 ""문장 안에 들어가므로 에러가 뜸
        System.out.println("단비가 \"냐용\"이라고 했어요");
        // 그럴 땐 위와 같이 \" 로 표시하면 댐. (큰 따음표)

        // 그러면 \' 일때는 뭘까? (작음 따음표)
        //단비가 '뭘 봐?'라는 표정을 지었어요.
        System.out.println("단비가 \'뭘 봐\' 라는 표정으로 지었어요");
        System.out.println("단비가 '뭘 봐' 라는 표정으로 지었어요");
        // 응?똑같네?

        char c = 'A';
        c = '\'';
        System.out.println(c);
        //즉 \'는 한 글자를 대입하는 char에서 자주 쓰이고, '하나를 표시할 떄 쓰인다







    }
}

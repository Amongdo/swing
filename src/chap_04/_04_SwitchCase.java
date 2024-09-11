package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //전액 장학금
        //1등 : 전액 장학금
        //2등 : 반액 장학금
        //3등 : 반액 장학금
        //그 외 : 장학금 대상 아님

        //If else 문을 이용한 방법
        int ranking = 1; //1등
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if ( ranking ==2) {
            System.out.println("반액 장학금");
        } else if (ranking == 3) {
            System.out.println("반액 장학금");
        } //랭킹2와 랭킹3의 프린트결과값이 동일하므로
        //else if (ranking ==2 || ranking ==3)으로 통일 가능
          else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch 문을 이용
//        switch ( expression) {
//            case A: ...수행할 명령
//                break;
//            case B:
//                break;
//            case C:
//                break;
//            default:...수행할 명령

        ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상아님");


        }
        System.out.println("조회 완료 #2(");
        // break;란 의미는 그 전의 명령이 실행되면, 그 명령을 빠져나온다는 의미

        //case 2 랑 case3 합치는 것도 가능
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상아님");


        }
        System.out.println("조회 완료 #3");


        //중고상품의 등급에 따른 가격책정( 1급: 최상, 4급:최하)
        int grade = 1; // 등급
        int price = 7000; //기본가격
         switch (grade) {
             case 1:
                 price += 1000;
             case 2:
                 price += 1000;
             case 3:
                 price += 1000;
                 break;
         }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        //1등급일땐 10000원, 2등급일땐 9000원.. 이해하기..!

        //여러 조건 혹은 어떤 범위에 대해서 알고 싶을 때는 If문장을 쓰고,
        //어떤 정확한 값에 대해 계산을 하게 되는 경우는 Switch를 쓴다




    }
}

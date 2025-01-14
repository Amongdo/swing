package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue

        //치킨 주문손님들 중에 노쇼손님들이 있다고 가정
        //for

        int max = 20; //최대 판매수량
        int sold = 0; //현재 판매수량
        int noShow = 17; //no show손님번호

        for (int i = 1; i <= 50; i++) {
            System.out.println( i + " 번 손님,주문하신 치킨 나왔습니다");

            //손님이 없다면? noShow
            if (i == noShow) {
                System.out.println(i +" 번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다");
                continue;
            }


            sold++; //판매처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }
        }
        System.out.println("금일 영업을 종료합니다");
        System.out.println("---------------------");

        //While
        sold = 0;
        int index = 0;
        // while문장안에 index ==max가 되면 break;탈출하라는 명령어가 있으니
        //밑의 표현을 while (true) { 로 대체가능
        while (index < 50) {
            index++;
            System.out.println( index + " 번 손님, 주문하신 치킨 나왔습니다");

            //손님이 없다면?
            if (index == noShow) {
                System.out.println(index + " 번 손님, 노쇼로 인해 다음 손님에게 기회가 주어집니다");
                continue;
            }


            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }

        }
        System.out.println("금일 영업을 종료합니다");
    }
}

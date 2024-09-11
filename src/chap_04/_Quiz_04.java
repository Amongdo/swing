package chap_04;



public class _Quiz_04 {
    public static void main(String[] args) {
        //주차요금은 시간당 4000, 일일 최대요금은 30000원
        //경차, 장애인 차량은 최종요금에서 50프로 할인
        //장애인 차량의 기준 : 직접 운전 혹은 탑승 자체만으로 적용가능

        //주차요금예시
        //일반 차량 5시간 주차 시 20000원
        //경차 차량 5시간 주차 시 10000원
        //장애인 차량 10시간 주차 시 15000원

        //실행결과
        //주차요금은 20000원입니다
        //주차요금은 10000원입니다
        //주차요금은 15000원입니다
        int hour = 10; // 주차 시간
        boolean isSmallCar = true; //경차여부
        boolean withDisabledPerson = false; //장애여부
        //30000원 초과시 일일 최대 요금으로 설정
        int fee = hour * 4000;  // 시간당 4000
        if (fee > 30000) {
            fee = 30000;
        }
        // 경차 및 장애인일 경우 50프로 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2;
        }
        //실행 결과 출력
        System.out.println("주차 요금은" + fee + " 원입니다");
    }


}

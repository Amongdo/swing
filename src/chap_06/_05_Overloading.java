package chap_06;

public class _05_Overloading {
    public static int getPower(int number) { //"4"
        int result = number*number;
        return result;
    }
        // 밑에 메소드 원래 getPowerStr에서 Str을 제거해서 위 메소드와 통일시킨 것
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number*number;
    }
        //이것도 원랜 getPowerByExp 메소드 였는데, Exp없애고 통일시킴
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        //메소드 오버로딩, 이름이 같은 메소드를 여러개 만드는 것
        //같은 메소드명 이여도, ()안의 자료형의 형태가 다르거나, 자료형의 전달값 갯수가 다를 경우,통일시킬 수 있다
        //이렇게 하는 이유는, 어짜피 계산메소드인데 여러 형태의 메소드로 남길 경우, 정작 필요한 메소드를 찾는데 시간이 걸리기 대문
        //단 반환형이 다른 경우는 중복적용할 수 없다. 예:int형과 double형
        System.out.println(getPower(3)); // 3*3 = 9
        System.out.println(getPower("4")); // 4*+4 = 16, getPowerStr에서 Str을 없앰
        System.out.println(getPower(4, 4));

    }
}

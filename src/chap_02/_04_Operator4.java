package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // ||는 or 이라는 뜻
        // 위 3개중 1개라도 트루이면 트루

        System.out.println(김치찌개 && 계란말이 && 제육볶음); // &&는 and 라는 뜻
        //and 연산
        System.out.println((5 > 3) && (3 > 1)); // 5는 3보다 크고, 3은 1보다 크다.참
        System.out.println((5 > 3) && (3 < 1)); // 5는 3보다 크고, 3은 1보다 작다.거짓
        //or 연산
        System.out.println((5 > 3) || (3 < 1)); // 참
        System.out.println((5 < 3) || (3 < 1)); // 두개 다 거짓이므로, 거짓

        //System.out.println( 5 > 3 > 1); //동시에 2개 이상의 연산은 불가능

        //논리 부정 연산자
        System.out.println(!true);
        System.out.println(!(5 == 5)); // 5==5는 참 이지만, !가 있어서 거짓이 된다.





    }
}

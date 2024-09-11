package chap_05;

public class _Quiz_05 {
    //신발 사이즈는 250부터 295까지 5씩 증가
    //신발 사이즈는 총 10가지
    //실해 결과
    //사이즈 250(재고 있음)
    //사이즈 295(재고 있음)
    public static void main(String[] args) {
        int size0 = 250;
        for (int i = 0; i < 10; i++) {
            System.out.println("사이즈 " + (size0 + 5*i) + "(재고 있음)");
        }
        System.out.println();

        System.out.println("-----------");


        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }
        for (int size : sizeArray){
            System.out.println("사이즈" + size + "(재고 있음)");
        }

    }

}

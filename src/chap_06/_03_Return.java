package chap_06;

public class _03_Return {
    //호텔 전화번호,,void는 아무것도 반환하지 않겠다라는 표현이였다..!
    public static String getPhoneNumber() {
        String phoneNumber = "02-1111-1111";
        return phoneNumber;
    }
    //호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";
    }
    //호텔 액티비티
    public static String getActivity() {
        return "볼링장, 탁구장, 노래방";
    }



    public static void main(String[] args) {
        //return, 반환값
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호는 " + contactNumber);
        String address = getAddress();
        System.out.println("헤톨 주소는 " +  address);
        System.out.println("호텔 액티비티는 " + getActivity());
    }


}

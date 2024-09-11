package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id1 = "901231-1234567";
        String id2 = "030708-4567890";

        System.out.println(id1.substring(0, 8));
        System.out.println(id2.substring(id2.indexOf("03"), id2.indexOf("567")));
        System.out.println(id1.substring(0, id1.indexOf("-") + 21));




    }
}

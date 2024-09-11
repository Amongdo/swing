package chap_05;

public class _03_MultiArrary {
    public static void main(String[] args) {
        //다차원 배열(2차원 배열)
        //그 전껀 1차원 배열
        //소규모 영화관 좌석을 떠올려 보자
        //A1~A5
        //B1~B5
        //C1~C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};
        //Art키 + 드래그하면 원하는 부분만 드래그 가능
        //3x5 크기의 2차원 배열이라고 표현함
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        //B2에 접근하려면?
        System.out.println(seats[1][1]);
        //C5에 접근하려면?
        System.out.println(seats[2][4]);

        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3",},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        //A3에 접근하려면?
        System.out.println(seats2[0][2]);

        //A5에 접근하려면?
        //System.out.println(seats2[0][4]);<<< Error

        //3차원 배열 만들기
//        String[][][] marray =new String[][][] {
//                {{}, {}, {}},
//                {{}, {}, {}},
//                {{},{}}
//        };
//        maaray[0][1][2]

     }
}

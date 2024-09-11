package chap_04;

public class _06_while {
    public static void main(String[] args) {
        //반복문 while
        //for문은 정확히 횟수가 정해져 있을 때 씀. 그거외엔 while

        int distance = 25; //전체 거리 25m
        int move = 0; //현재 이동 거리 0m
//        while(조건) {
//
//        }
        while(move < distance) {
            //현재 이동 거리가 전체 이동 거리보다 적다는 조건이 참인 동안 반복 수행

            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리는 "+ move);
            move += 3; // 3미터 이동
        }
        System.out.println("도착하였습니다");

    }
}

package YoutubeLecture01;

public class UserExam {
    public static void main(String[] args) {
        User user = new User("안병도", "ㅁㄴㅇㅁㄴㅇ");
//        System.out.println(user.getName());
//        System.out.println(user.getEmail());
        //toString 을 쓰면 뒤 2문장은 안 써도 됨 . 밑에 처럼 써주면 댐
        System.out.println(user);


        User user2 = new User("asd", "asd", "asdasd");
//        System.out.println(user2.getName());
//        System.out.println(user2.getEmail());
//        System.out.println(user2.getPassword());
        System.out.println(user2);
    }
}

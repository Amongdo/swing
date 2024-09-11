package YoutubeLecture01;

public class User {
    private String email;
    private String password;
    private String name;
    //private 으로 잡아주면 외부에서 이 변수들을 적용할 수 읎다!

    //생성자를 1개라도 만들게 되면, 기본생성자를 자동으로 안만든다
    public User(String name, String email) {
//        this.email = email;
//        this.name = name;
        //밑에 매개변수 3개의 this메소드중 2개가 겹치기 때문에,위 같은 경우 똑같이 쓰는걸 방지한다
        //고로 본인을 재소환해서 중복을 방지해줌
        this(name, email, null);
        //this 생성자는 super생성자를 제외하곤 항상 클래스의 첫번째 줄에
        //등장해야함!~!~!안그럼 컴파일 에러뜸
    }
        //생성자 오버로딩!생성자도 여러개를 가질 수 있다.
    public User(String name, String email, String password) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    //get set 메서드는 property라고 말한다
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    //setter가 없는 getting만 있는 클래스를 불변객체라고 한다


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

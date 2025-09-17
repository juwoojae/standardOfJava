package chapter07.Ex7_14;

public class Singleton {
    private static Singleton s = new Singleton();

    /**
     * private 생성자를 이용 ->외부에서 인스턴스 생성 불가
     * 인스턴스의 생성을 제어한다
     * static 으로 선언해서 메서드 영역에 생성후 프로그램이 종료할때 까지 유지 (모든 객체가 공유)
     */
    private Singleton() {
    }
    public static Singleton getInstance(){
        return s;
    }
}

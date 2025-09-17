package chapter06.Ex6_27;
/**
 * 클래스 초기화 블록이 클래스정보, 클래스 변수, 클래스 메서드 , 클래스 초기화 블록이 메서드영역에 로드될때  딱 1번 실행이 된다
 * 생성자보다 인스턴스 초기화 블록이 빠르다
 */
public class BlockEx {
    //클래스 초기화 블록
    static{
        System.out.println("static { }");
    }
    //인스턴스 초기화 블록
    {
        System.out.println("{ }");
    }

    BlockEx(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockEx blockEx = new BlockEx()");
        BlockEx blockEx = new BlockEx();

        System.out.println("BlockEx blockEx2 = new BlockEx2()");
        BlockEx blockEx2 = new BlockEx();
    }

}

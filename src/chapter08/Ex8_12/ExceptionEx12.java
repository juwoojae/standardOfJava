package chapter08.Ex8_12;

public class ExceptionEx12{
    public static void main(String[] args) throws Exception {
        method1();  //예외를 전달 받았으나 main 에서도 처리 하지 않았으므로 결국 main 메서드가 끝난후 프로그램 종료
    }
    //호출한 메서드로 예외 전파 -> main
    static void method1()throws Exception{
        method2();
    }
    //호출한 메서드로 예외 전파 ->method1
    static  void method2() throws Exception{
        throw new Exception(); //여기서 예외 던지기 checked error 라서 메서드의 예외 선언 이 필요
    }
}

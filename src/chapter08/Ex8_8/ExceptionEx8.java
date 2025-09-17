package chapter08.Ex8_8;

import java.util.logging.Logger;

/**
 *  catch () 안의 참조 변수를 이용한 메세지 찍기 getMessage()
 *  발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻을수 있다 printStackTrace()
 */
public class ExceptionEx8 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4/0);  //예외 발생
            System.out.println(4); //try 의 {} 에서 예외 발생 line 이후의 코드는 실행되지 않는다
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("예외메세지 :"+e.getMessage());
        }
        System.out.println(6); //메서드의 끝
    }
}

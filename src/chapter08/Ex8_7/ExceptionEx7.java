package chapter08.Ex8_7;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4/0);  //예외 발생
            System.out.println(4); //try 의 {} 에서 예외 발생 line 이후의 코드는 실행되지 않는다
        }catch(ArithmeticException e){
            if(e instanceof ArithmeticException)
            System.out.println("ArithmeticException");
        }catch (Exception e){  //ArithmeticException 을 제외한 모든 예외들이 여기서 처리된다
            System.out.println("Exception");
        }
        System.out.println(6); //메서드의 끝
    }
}

package chapter07.Ex7_11;
/**
 * staitc import 문 클래스 이름을 생략할수 있다
 */

import static java.lang.System.out;
import static java.lang.Integer.*;
public class StaticImportEx {
    public static void main(String[] args) {
        String num = "100";
        //System.out.println(Integer.parseInt(num));
        out.println(parseInt(num)+10);
        //System.out.println();
        out.println(num);
    }
}

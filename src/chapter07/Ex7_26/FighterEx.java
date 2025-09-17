package chapter07.Ex7_26;

public class FighterEx {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        if(f instanceof Unit)
            System.out.println("f는 Unit클래스의 자손입니다");
        if(f instanceof Fightable)
            System.out.println("f는 Fightable 인터페이스의 구현체입니다");
        if(f instanceof Movable)
            System.out.println("f는 Movable 인터페이스의 구현체입니다");
        if(f instanceof Attackable)
            System.out.println("f는 Attackable 인터페이스의 구현체입니다");
        if(f instanceof Object)
            System.out.println("f는 Object클래스의 자손입니다");
    }
}

/**
 * 인터페이스 구현과 동시에 상속을 받을수도 있다
 */
class Fighter extends Unit implements Fightable {

    @Override
    public void attack(Unit u) {
        System.out.println( u+"의 공격");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("x 이동 = " + x + 1);
        System.out.println("y 이동 " + y + 1);
    }
}

class Unit {
    int currentHP;
    int x;
    int y;

    @Override
    public String toString() {
        return "Unit{" +
                "currentHP=" + currentHP +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

interface Fightable extends Movable, Attackable {
} //인터페이스는 다중 상속이 가능하다

interface Movable {
    void move(int x, int y); // 추상 메서드
}

interface Attackable {
    void attack(Unit u); //추상 메서드
}
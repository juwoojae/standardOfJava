package chapter06.Ex6_20;

/**
 * 클래스 멤버와 인스턴스 멤버간의 참조와 호출 예제
 * 클래스메서드는 인스턴스 생성 없이도 호출 해줄수 있다
 * 인스턴스 멤버는 클래스 멤버에 호출, 접근이 가능하다
 * 클래스 멤버는 인스턴스 멤버에 호출, 접근이 불가능하다(클래스 메서드의 경우 내부에 인스턴스 생성하면 가능)
 * 이유는 인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만, 클래스 멤버가 존재하는 시점에
 * 인스턴스 멤버가 존재하지 않을수 있기 때문에 컴파일러가 막는다
 */
class MemberCall {
    int instanceVar = 10;   //인스턴스 변수
    static int classVar = 20; //클래스 변수

    int instanceVar2 = classVar;
    //static int classVar2 = instanceVar; 에러. 클래스 변수는 인스턴스 변수를 사용할수 없다

    static void staticMethod1(){
        System.out.println(classVar); //클래스 메서드에서 클래스 변수 호출 가능
        //System.out.println(instanceVar2); 에러. 클래스 메서드에서 인스턴스 변수를 사용할수 없다
        MemberCall mc = new MemberCall();
        System.out.println(mc.instanceVar); //인스턴스 생성후부터 클래스 메서드에서 인스턴스 변수를 호출가능
    }

    void instanceMethod1(){
        System.out.println(classVar);   //인스턴스 메서드를 쓴다는것은 인스턴스가 생성된것이므로 당연히 둘다 가능
        System.out.println(instanceVar);
    }

    static void staticMethod2(){
        staticMethod1();
        //instanceMethod1(); 에러. 클래스 메서드에서 인스턴스 메서드를 사용할수 없다
        MemberCall mc =new MemberCall(); //인스턴스 생성
        mc.instanceMethod1(); //인스턴스 생성후부터 클래스 메서드에서 인스턴스 메서드 호출 가능
    }

    void instanceMethod2(){ //인스턴스 메서드에서는 당연히 클래스 메서드, 클래스 변수 호출,접근 가능
        staticMethod1();
        staticMethod2();
        System.out.println(classVar);
    }
}
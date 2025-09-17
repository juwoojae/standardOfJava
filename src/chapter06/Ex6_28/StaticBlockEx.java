package chapter06.Ex6_28;

public class StaticBlockEx {
    static int[] arr = new int[10];

    static {
        for(int i =0;i<arr.length;i++){
            //arr 의 모든 원소를 1 로 초기화
            arr[i] = 1;
        }
    }

    public static void main(String[] args) {
        for (int e : arr) {
            System.out.println(e);
        }
    }
}

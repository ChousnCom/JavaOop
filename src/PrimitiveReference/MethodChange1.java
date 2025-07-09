package PrimitiveReference;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후 a = " + a);
    }
    static void changePrimitive(int x) {
        x = 20;
    }
}


//해당 결과 값은 10;
//코드 실행 순서 상 x는 반환되지 않음 --> 이는 메서드 안에서만 잠깐 값이 바뀔뿐
//main 코드에 어떠한 영향도 주지 못함.
//메서드 종료 시점에서 -> x값은 소멸.


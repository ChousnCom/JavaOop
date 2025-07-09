package PrimitiveReference;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //a변경하기
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

//변수의 대입은 변수에 들어있는 값을 복사해서 대입. 여기서는 변수 a에 들어있는 값 10을 복사해서 변수 b에 대입.
//변수 a자체를 b에 대입하는 것이 아니다!

// int b=a라 했을 때 변수에 들어있는 값을 복사해서 전달한다는 점.
// 따라서 a = 20 b=30이라 했을 때 각각 본인의 값만 변경되는 것을 확인 가능.


package PrimitiveReference;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}

//bigData.count = 0이 출력 ==> 초기화 되지 않은 멤버변수라 자동 초기화
//bigData.data = null이 출력 => 해당 변수에는 아직 아무것도 참조하고 있지 않다.
//bigData.data.value => null 값에 .을 찍은 것으로 참조할 곳이 없으므로 NPE 발생

// 문제를 해결 하려면?
// bigData.data 멤버 변수에 참조값을 할당하면 됨.

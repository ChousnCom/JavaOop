package PrimitiveReference;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NPE 발생
        System.out.println("dat = " + data.value);
    }
}

// 결과적으로 null 값은 참조할 주소가 존재하지 않는 다는 뜻.
// 참조할 객체 인스턴스가 존재하지 않으므로 NPE 발생 후 프로그램 종료.
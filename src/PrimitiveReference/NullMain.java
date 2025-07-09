package PrimitiveReference;

public class NullMain {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
}

//null ==> data에는 아직 가리키는 객체가 없음을 나타냄
//즉, 참조값을 찾을 수 없음을 나타냄.
package PrimitiveReference;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();

        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}


// Data 인스턴스를 만들고 BigData.data 멤버 변수에 참조값을 할당하면 아까 같은 NPE 문제 해결

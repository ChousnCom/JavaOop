package PrimitiveReference;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data(); //x001
        dataA.value = 10; //x001 주소지에 존재하는 value 값이 = 10;
        System.out.println("메서드 호출 전 dataA.value = " + dataA.value); // 10
        changeReference(dataA);
        System.out.println("메서드 호출 전 dataA.value = " + dataA.value); //20

    }
    static void changeReference(Data dataX) {
        dataX.value = 20; // Data dataX = dataA ==> x001.value == 20;
    }
}

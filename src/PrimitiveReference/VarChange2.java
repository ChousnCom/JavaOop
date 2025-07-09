package PrimitiveReference;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data(); //x001
        dataA.value = 10; //x001 의 value값이 == 10
        Data dataB = dataA; //dataB의 참조값은 == x001
        System.out.println("dataA 참조값 = " + dataA); //x001
        System.out.println("dataB 참조값 = " + dataB); //x001
        System.out.println("dataA.value = " + dataA.value); //10
        System.out.println("dataB.value = " + dataB.value); //10

        //dataA 변경
        dataA.value = 20; //x001에 존재하는 value 값이 =20으로 변경
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);//20
        System.out.println("dataB.value = " + dataB.value);//20
        //-> 같은 참조값을 공유하고 있으므로.

        //dataB변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
        //해당 결과 또한 2번째 결과처럼 모두 30으로 변경
    }
}
//이는 값을 그대로 복사해서 대입한다는 특성 때문 해당 변수는 참조형이기 때문에
// 해당 코드에서 적용된 dataA 와 dataB는 서로 같은 참조값을 지니게 됨.

package ClassStart;

//앞선 문제들은 단순 변수나 배열을 사용해서 풀었지만
//해당 문제는 클래스를 선언해서 풀이.

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1= new Student();
        Student student2= new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("학생1 : " + student1.name + "나이 : " + student1.age + "성적 : " + student1.grade);
        System.out.println("학생2 : " + student2.name + "나이 : " + student2.age + "성적 : " + student2.grade);

        System.out.println("student1 의 참조값 : " + student1);
        System.out.println("student2 의 참조값 : " + student2);
    }
}
//클래스 사용 ==> 학생(Student)라는 타입을 직접 만들면 되지 않은가?
//클래스르 사용하게 되면 타입을 직접 만들 수 있음.
//사용자가 직접 정의하는 타입을 만들려면 설계도가 필요 == 이러한 설계도가 바로 클래스
// 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객채 or 인스턴스라고 칭함.
// ex. Student student1 = new Student() => 인스턴스임.

//동작
//new 통해 객체(인스턴스)가 생성되면 멤버변수를 사용하는데 필요한 메모리공간이 함께 확보됨
//인스턴스가 만들어진 시점에서는 이 객체에 접근할 수있는 참조값을 반환 ex.) Student student1 -> 변수에는 참조값이 담기는 것.
// new Student()의 참조값이 x001 이라면 Student student1 = new Student == Student student1 = x001; 이렇게.
// student1 변수는 인제 참조값을 지니고 있으며 -> 해당 변수를 통해 객체를 접근(참조) 가능히다 => 해당 변수를 통해 실제 객체를 접근 및 멤버변수를 사용가능하다는 의미
// 참고로 같은 클래스를 공유하더라도 각기 다른 인스턴스라면 => 참조 값이 다름 ex. student1=x001, student2=x002
// .은 객체 접근에 사용. 객체가 가지고 있는 값에 멤버변수에 값을 대입하려면 먼저 객체에 접근해야함.
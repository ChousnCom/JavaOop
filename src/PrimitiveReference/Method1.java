package PrimitiveReference;

//기존 1강에서 classStart3 코드를 메서드를 통해 리팩토링 해보자
//기존 코드를 보면 학생 정보를 입력하는 부분이 중복이다.
//학생이 추가 될수록 생성해야할 학생 객체와 값을 할당해야하는 멤버변수의 수가 늘어남.
//이 부분의 중복을 해소 해보자


public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student(); //x001
        Student student2 = new Student(); //x002
        initStudent(student1, "학생1", 15, 90);
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);

    }
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    static void printStudent(Student student) {
        System.out.println("이름 :  " + student.name + "나이 : "+student.age + "성적 : " + student.grade);
    }
}

//멤버변수를 초기화하는 부분을 메서드를 적용하여 처리함.
//그럼에도 아직 중복되는 부분이 있음 바로 객체 생성하고 초기화하는 부분.
//이를 리팩토링 해보자,
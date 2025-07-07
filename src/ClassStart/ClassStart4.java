package ClassStart;

//기존 Stduent클래스를 사용하여 아쉬웠던 출력부를 배열과 섞어 해결해보자

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student(); //x001 student1인스턴스 생성
        Student student2 = new Student(); //x002  student2인스턴스 생성

        student1.name ="학생1"; //.을 이용하여 인스턴스 접근 및 값 초기화.
        student1.age =15;
        student1.grade = 90;

        student2.name="학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2]; //Student타입의 크기가 2인 배열 생성.
        students[0] = student1; //student첫 번째 요소에 x001 담기
        students[1] = student2; //student 두 번째 요소에 x002를 담기

        System.out.println("이름 : " + students[0].name + "나이 : " + students[0].age + "성적 : "+ students[0].grade);
        System.out.println("이름 : " + students[1].name + "나이 : " + students[1].age + "성적 : "+ students[1].grade);
    }
}

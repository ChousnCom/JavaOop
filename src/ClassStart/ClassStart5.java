package ClassStart;

//앞서서 클래스에 배열을 도입했기 때문에 이제 출력부에서 반복문을 통해 코드를 리팩토링 할 수 있음.

public class ClassStart5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "학생1";
        s1.age = 15;
        s1.grade = 90;

        s2.name = "학생2";
        s2.age = 16;
        s2.grade = 80;

        Student []students = new Student[]{s1, s2};
        for (Student s : students) {
            System.out.println("이름 : " + s.name + "나이 : " + s.age + "성적 : " + s.grade);
        }
    }
}

//향상 for문 ==> for(int i = 0; i<students.length; i++){
//                      Student s = students[i];
//                          (~ = s.name ~~~)
// for(Student s : stduetns){ ~ } 같은 말.
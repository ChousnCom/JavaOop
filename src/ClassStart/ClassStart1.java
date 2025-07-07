package ClassStart;

//요구 사항 첫 학생의 이름 == 학생1 나이 15 성적 90
//2. 학생 2, 나이 16, 성적 80
//각 학생 정보를 이름,나이,성적으로 출력
// 변수를 사용해서 학생 정보 저장 및 학생 정보 출력

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name="학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름 : " + student1Name + "나이 :" + student1Age + "성적:" + student1Grade);
        System.out.println("이름 : " + student2Name + "나이 :" + student2Age + "성적:" + student2Grade);;
    }
}
//오직 변수만을 사용해서 학생 2명의 정보를 다루는 코드를 작성함
//해당 코드의 문제는 학생 수가 늘어날때ㅑ마다 변수를 추가 선언해야 하며 -> 학생 수가 늘어날 수록 출력하는 부분도 계속 늘어나야 한다.
//해당 코드를 더 간결하게 진행 시킬 수 없나?
//-> 배열을 사용하여 조금 더 간결하게 문제를 해결 가능하다.
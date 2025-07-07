package ClassStart;

//요구사항은 앞선 상황과 같으며
//이번 부분에서는 기존 코드보다 리팩토링하여 배열로 문제를 해결해 보자.

public class ClassStart2 {
    public static void main(String[] args) {
        String [] studentNames = {"학생1", "학생2"};
        int [] studentAges = {15, 16};
        int [] studentGrades = {90, 80};

        for(int i = 0; i<studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + "나이 : " + studentAges[i] + "성적 : " + studentGrades[i]);
        }
    }
}

//배열을 통해 더 이상 출력부는 건들지 않아도 됨.
//학생 데이터를 추가하고 싶으면 각 배열에 직접 값을 입력해서 추가해야함.
// 그러나 데이터 수정이 발생할 경우 ==> 만약 학생2의 데이터를 수정하고 싶으면 학생2에 관련된 데이터를 정확하게 찾아서 수정 해야함.
// 컴퓨터가 관라하기에는 상관없지만 수정 작업 및 삭제 작업시 사람이 관리하기에는 그리 좋은 코드가 아님.
// => 사람이 관리하기 좋은 코드가 되려면? => 학생이라는 개념 자체를 하나로 묶는 것. 그리하여 학생 별로 본인의 이름,나이,성적을 관리하는 것이 좋음.
// 배열을 통해 푼 문제를 학생이라는 개념을 만들고 각 학생별로 본인의 이름,나이,성적을 관리하는 것 ==> 클래스를 도입하여 해결해보자.
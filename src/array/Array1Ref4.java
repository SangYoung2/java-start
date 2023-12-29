package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        // 배열 변수 선언 및 생성
        int [] students = {90, 80, 70, 60, 50}; // 변수 생성시 자바에서 int의 배열인것을 알고 변수 생성(new int []) 부분을 생략하고 {}에 값을 넣어도 생성된다. 한줄로 입력해야한다.


        // 반복문을 통하여 배열의 출력을 쉽게 반복 시킬 수 있다
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
        }
    }
}

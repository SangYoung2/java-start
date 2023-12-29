package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        // 배열 변수 선언 및 생성
        int [] students;
        students = new int[]{90, 80, 70, 60, 50}; // 변수 생성시 []뒤에 {}를 사용하여 값을 넣을 수 있다.


        // 반복문을 통하여 배열의 출력을 쉽게 반복 시킬 수 있다
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
        }
    }
}

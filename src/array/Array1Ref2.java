package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int [] students;
        students = new int[5]; // 배열 변수 선언 및 생성

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 반복문을 통하여 배열의 출력을 쉽게 반복 시킬 수 있다
        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
        }
    }
}

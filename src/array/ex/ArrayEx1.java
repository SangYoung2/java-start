package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 배열 변수 선언 및 생성
        int [] students = {90, 80, 70, 60, 50};

        int total = 0;
        // 반복문을 통하여 배열의 출력을 쉽게 반복 시킬 수 있다
        for (int student : students) {
            total += student;
        }
        double average = (total) / 5;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}

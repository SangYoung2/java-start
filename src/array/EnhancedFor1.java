package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반적인 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문 처음부터 끝까지 탐색  => for(저장할 변수 : 배열) {}
        for (int number: numbers) { // iter명령어를 사용하면 foreach문을 변수와 배열을 넣어 만들어 준다.
            System.out.println(number);
        }
    }
}

package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 3) { // true면 반복 false가 되면 loop에서 빠져나옴
            count = count + 1;
            System.out.println("현재 숫자는 = " + count);
        }
    }
}

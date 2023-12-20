package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ; i++) { // for(int i = 1; ; i++) => 조건식이 없기에 i값은 무한히 증가
            sum = sum + i;
            if(sum > 10) {
                System.out.println("합이 10보다 크면 종료 i = " + i + " sum = " + sum);
                break;
            }
        }
    }
}

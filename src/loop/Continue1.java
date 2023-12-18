package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5){
            if(i == 3){
                i++;
                continue; // continue실행시 다음 줄로 넘어가지 않고 반복문의 조건문으로 돌아가서 실행
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}

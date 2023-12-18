package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;
        
        // do while 문은 최초 한번은 실행한 후 조건을 검사하여 참이면 {}안의 내용을 반복 거짓이면 종료
        do {
            System.out.println("현재 숫자는 = " + i);
            i++;
        }
        while (i < 3);
        
    }
}

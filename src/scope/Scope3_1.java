package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // if에서만 쓰이는 temp를 main에서 생존이 가능하여 비효율적인 메모리가 발생, 코드 복잡성 증가
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}

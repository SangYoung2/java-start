package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if(true){
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
        System.out.println("main m = " + m); // main의 코드블럭 안에서 사용 가능
//        System.out.println("main x = " + x); if문의 코드블럭 안에서 사용 가능
    }
}

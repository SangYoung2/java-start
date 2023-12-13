package cond;

public class CondOp2 {
    public static void main(String[] args) {
        // 삼항 연산자 변수 = (조건) ? 참 : 거짓
        int age= 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("status = " + status + "age = " + age );
    }
}

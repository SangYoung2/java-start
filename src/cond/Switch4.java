package cond;

public class Switch4 {
    public static void main(String[] args) {
        // 자바 14이상에서부터 사용가능
        int grade = 2;
        
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 5500;
        };
        System.out.println("발급받은 쿠폰 = " + coupon);
    }
}

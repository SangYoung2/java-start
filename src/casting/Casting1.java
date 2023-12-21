package casting;

public class Casting1 {
    public static void main(String[] args) {
        // 작은 범위에서 큰 범위로의 대입은 자바언어에서 자동으로 형 변환을 하여 변수에 넣어준다.
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}

package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue = " + intValue);

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver = " + intValue); // int범위를 넘어서면 가장 작은 숫자부터 다시 시작
    }
}

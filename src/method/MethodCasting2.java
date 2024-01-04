package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // int형 변수를 double형 변수에 넣는것은 작은 것에서 큰 것에서 옮기는 것이기에 문제가 자바에사 자동으로 형변환을 하여 대입한다.
    }

    public static void printNumber(double n){
        System.out.println("숫자: " + n);
    }
}

package operator;

public class Op3 {
    public static void main(String[] args) {
        int sum1 = 1 + 2 * 3; // 1 + (2 * 3) 곱셈이 우선순위가 높다.
        int sum2 = (1 + 2) * 3; // 괄호가 있을경우 괄호의 우선순위가 높다.
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}

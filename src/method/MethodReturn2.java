package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }
    
    public static void checkAge(int age) {
        if(age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return; // return을 만나면 반환타입에 상관없이 바로 메서드를 빠져나옴
        }
        System.out.println(age + "살, 입장하세요");
    }
}

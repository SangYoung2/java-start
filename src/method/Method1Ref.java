package method;

public class Method1Ref {
    public static void main(String[] args) {
        //계산
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        //계산 2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    public static int add(int a, int b){ // 메서드의 선언 부분으로, 메서드의 이름, 반환 타입, 매개변수(파라미터) 목록을 포함하여 메서드를 선언
        // 메서드가 호출되었을 시 실행되는 부분
        System.out.println(a + " + " + b + " 연상 수행");
        int sum = a + b;
        return sum;
    }

    /*
    #메서드 정의
    제어자 반환타입 메서드이름(매개변수 목록) {
        메서드 본문
    }
        제어자: public, static과 같은 부분이다.
        반환타입: 메서드가 실행 된 후 반환하는 데이터의 타입을 지정, 메서드가 값을 반환하지 안흔 경우, 없다는 뜻의 void를 사용해야한다. ex) void print(Stirng str)
        메서드 이름: 메서드의 이름이다. 메서드를 호출하는 데 사용
        매개변수: 입력 값으로, 메서드 내부에서 사용할 수있는 변수이다. 매개변수는 옵션이다. 입력값이 필요 없는 메서드는 매개변수를 지정하지 않아도 된다.
        메서드 본문: 실제 메서드의 코드가 위치한다. {}사이에 코드를 작성
     */
}

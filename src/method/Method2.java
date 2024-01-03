package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println(" = 프로그램이 실행중입니다. = ");
        printFooter();
    }

    public static void printHeader() { //반환 값이 없을경우 void로 지정하여 메소드를 선언
        System.out.println(" = 프로그램을 시작합니다. =");
    }

    public static void printFooter() {
        System.out.println(" = 프로그램을 종료합니다. = ");
    }
}

package Scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();

            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); // 정수\n 으로 입력되어 정수만 가져가고 \n은 남기에 처음으로 돌아갔을때 \n을 읽어들여서 name입력에 문제가 발생
            input.nextLine();
            
            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}

package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)

        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (L은 Long이라는 뜻 대문자로 작성 [관례])

        //실수
        float f = 10.0f; // float는 뒤에 f를 붙여서 구분시켜준다.
        double d = 10.0; // float보다 광 범위한 실수를 저장 할 수 있다.
        
        //기타
        boolean bl = true; // 1byte를 차지
        char c = 'a'; // 1byte를 차지
        String St = "String"; // 글자 수에 따라 동적으로 달라짐
    }
}
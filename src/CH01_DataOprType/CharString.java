package CH01_DataOprType;

public class CharString {
    public static void main(String[] args) {
        // 문자열의 표현

        // Char VS String
        System.out.println("Hello World!"); // 큰 따옴표로 둘러싼 여러개의 문자로 구성된 문자열(String)
        System.out.println('H'); // 작은 따옴표로 둘러싼 1개의 문자(Char)
        System.out.println("H"); // 한개의 글자이지만 큰 따옴표로 둘러쌌기 때문에 문자열(String)

        // String을 다루며 생기는 문제점
        System.out.println("Hello \nWorld"); // 줄바꿈은 물리적인 Enter 버튼을 누르는 것이 아니라 \n을 사용 (New Line)
        System.out.println("Hello \"World\""); // \"를 사용하여 문자 그대로의 큰 따옴표를 표현할 수 있음
        // Java에서 큰 따옴표는 통상적으로 문자 그대로 쓰이지 않고 문자열의 시작과 끝을 표현하기 위해 사용되기 때문에
        // 문자열 내에서 문자 그대로의 큰 따옴표를 사용하기 위해서는 \" 표현이 필요함
        // Hello "World" 출력
        // 이러한 역슬래시를 함께 사용하여 뒤에 따라오는 어떤 용도가 있는 문자를 escape 문자라고 한다.


    }
}

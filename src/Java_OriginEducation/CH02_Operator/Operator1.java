package Java_OriginEducation.CH02_Operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b; // 원래는 2.5이지만
        System.out.println("a / b = " + div); // int는 뒤의 소숫점 절삭하고 정수부분만 표현

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 5 나누기 2의 나머지이므로 1 출력

        // 0으로 나누면 오류가 발생한다.
        //int z = 10 / 0; // java.lang.ArithmeticException: / by zero 예외 발생

    }
}

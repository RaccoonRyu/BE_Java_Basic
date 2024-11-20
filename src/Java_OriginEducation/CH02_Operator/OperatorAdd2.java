package Java_OriginEducation.CH02_Operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위, 후위 증감연산자
        int a = 1;
        int b = 0;

        b = ++a; // 전위 : a의 현재 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b); // a가 먼저 증가된 후 b에 대입되어, a와 b 모두 2 출력

        a = 1; // a값 재지정
        b = 0; // b값 재지정

        b = a++; // 후위 : a의 현재값을 먼저 b에 대입하고, 이후에 a값을 증가시킴
        System.out.println("a = " + a + ", b = " + b); // a의 값을 증가하기 전에 먼저 b에 대입하기 때문에, a는 2, b는 1 출력
    }
}

package Java_OriginEducation.CH02_Operator;

public class Comp1 {
    public static void main(String[] args) {
        // 비교 연산자 1
        int a = 2;
        int b = 3;

        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true

        // 결과를 boolean 변수에 담을 수 있다.
        boolean result = a == b; // false가 대입된다.
        System.out.println(result); // false
    }
}

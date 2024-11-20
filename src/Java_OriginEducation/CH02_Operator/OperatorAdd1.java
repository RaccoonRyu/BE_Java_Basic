package Java_OriginEducation.CH02_Operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        // 증감 연산자 사용 전 변수 속의 값 1 증가
        int a = 0;
        a = a + 1;
        System.out.println("a = " + a); // 1

        // 증감 연산자 사용하여 변수 속의 값 1 증가
        ++a; // a = a + 1;과 동일
        System.out.println("a = " + a); // 2
        ++a;
        System.out.println("a = " + a); // 3

        --a;
        System.out.println("a = " + a); // 1이 감소해서 2
    }
}

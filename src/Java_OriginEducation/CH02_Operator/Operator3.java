package Java_OriginEducation.CH02_Operator;

public class Operator3 {
    public static void main(String[] args) {
        // 연산자 우선순위
        int sum1 = 1 + 2 * 3; // 1 + (2 * 3)
        int sum2 = (1 + 2) * 3; // 연산자 우선순위는 괄호가 더 높음
        System.out.println("sum1 = " + sum1); // 7
        System.out.println("sum2 = " + sum2); // 9
    }
}

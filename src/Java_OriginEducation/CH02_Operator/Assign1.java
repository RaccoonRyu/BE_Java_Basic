package Java_OriginEducation.CH02_Operator;

public class Assign1 {
    public static void main(String[] args) {
        // 복합 대입 연산자
        int a = 5;
        a += 3; // 8 (5 + 3) -> a = a + 3 과 동일. a랑 3을 먼저 더하고, 해당 값을 a에 대입
        a -= 2; // 6 (8 - 2) -> a = a - 2
        a *= 4; // 24 (6 * 4) -> a = a * 4
        a /= 3; // 8 (24 / 3) -> a = a / 3
        a %= 5; // 3 (8 % 5) -> a = a % 5
        System.out.println(a);
    }
}

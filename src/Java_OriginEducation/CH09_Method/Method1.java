package Java_OriginEducation.CH09_Method;

public class Method1 {
    // add 메서드
    public static int add (int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        // 메서드
        // 한번 정의하여 여러 번 재사용할 수 있다!

        int sum1 = add(5, 10); // 파라미터로 5와 10을 전달하여 add 메서드 호출
        System.out.println("결과 1 출력 : " + sum1);

        int sum2 = add(15, 20); // 파라미터로 15와 20을 전달하여 add 메서드 호출
        System.out.println("결과 2 출력 : " + sum2);
    }
}

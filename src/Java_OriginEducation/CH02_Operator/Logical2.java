package Java_OriginEducation.CH02_Operator;

public class Logical2 {
    public static void main(String[] args) {
        // 논리 연산자 2
        int a = 15;

        // a는 10보다 크고 20보다 작다 (AND)
        boolean result = a > 10 && a < 20; // true
        boolean result2 = 10 < a && a < 20; // true. 바로 위 문장과 동일한 결과지만 가독성 면에서 해당 코드가 더 보기 좋다.
        System.out.println(result); // true


    }
}

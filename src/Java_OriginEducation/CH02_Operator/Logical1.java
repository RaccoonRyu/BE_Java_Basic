package Java_OriginEducation.CH02_Operator;

public class Logical1 {
    public static void main(String[] args) {
        // 논리 연산자 1
        System.out.println("&& : AND 연산");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && false); // false

        System.out.println("|| : OR 연산");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || false); // false

        System.out.println("! 연산"); // 현재 논리 연산의 반대가 연산 결과 (참->거짓, 거짓->참 반환)
        System.out.println(!true); // false
        System.out.println(!false); // true

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a); // false
        System.out.println(!b); // true

    }
}

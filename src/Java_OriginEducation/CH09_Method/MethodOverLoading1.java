package Java_OriginEducation.CH09_Method;

public class MethodOverLoading1 {
    // 메서드 오버로딩
    // 매개변수의 개수가 다른 메서드들

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("1번 호출");
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("1 : " + add(1, 2));
        System.out.println("2 : " + add(1, 2, 3));
    }
}

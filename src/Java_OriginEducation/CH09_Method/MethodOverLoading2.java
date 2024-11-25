package Java_OriginEducation.CH09_Method;

public class MethodOverLoading2 {
    // 메서드 오버로딩
    // 매개변수의 타입이 다른 메서드들

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }

    public static void main(String[] args) {
        myMethod(1, 1.2);
        myMethod(1.2, 1);
    }
}

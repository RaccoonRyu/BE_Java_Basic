package Java_OriginEducation.CH09_Method;

public class MethodOverLoading3 {
    // 메서드 오버로딩
    // 매개변수의 타입이 다른 메서드들 2

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static void main(String[] args) {
        // 함수 내 매개변수의 타입에 최대한 맞는 메서드를 찾아서 실행하고, 그래도 없으면 형 변환 가능한 타입의 메서드를 찾아서 실행한다.
        System.out.println("1 : " + add(1, 2));
        System.out.println("2 : " + add(1.2, 1.5));
    }
}

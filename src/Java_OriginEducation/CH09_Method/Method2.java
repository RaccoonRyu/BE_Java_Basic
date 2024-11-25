package Java_OriginEducation.CH09_Method;

public class Method2 {

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다. =");
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다. =");
        return; // 반환형이 void이면 return;문 생략 가능
    }

    public static void main(String[] args) {
        // 매개변수나 반환타입이 없는 함수
        printHeader();
        System.out.println("= 프로그램이 동작합니다. =");
        printFooter();
    }
}

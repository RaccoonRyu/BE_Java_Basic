package Java_OriginEducation.CH06_TypeCast;

public class Cast4 {
    public static void main(String[] args) {
        // 자바에서의 계산은 아래 2가지로 종결
        // 1. 같은 타임 끼리의 계산은 같은 타입의 결과를 낸다.
        // 2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.

        int div1 = 3 / 2; // int-int 계산을 int에 대입하므로 1.5가 아닌 1 출력
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2; // int-int 계산을 double에 대입하므로 자동 형변환이 일어나 1.0 출력
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; // double-int 계산은 double-double로 자동 형변환이 되므로, 3.0 / 2.0으로 계산되어 1.5 출력
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2; // 3이 int이지만 명시적 형변환을 통해 double-int 계산이 되므로, double-double로 자동 형변환 후 계산되어 1.5 출력
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a / b; // a를 double형으로 먼저 캐스팅하고 b로 나눔
        System.out.println("result = " + result); // 1.5
    }
}

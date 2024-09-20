package CH02_Variable;

public class VariableDef {
    public static void main(String[] args) {
        // 변수의 정의

        // Java에서의 변수는 생성 시 변수 안에 어떤 데이터 타입이 들어갈 수 있는지 지정해주어야 한다.
        int a = 1; // integer(정수. int)
        System.out.println(a); // 1 출력

        //int b = 1.1; // int는 정수만 가능하기 때문에 b에 실수를 담을 수 없음
        double b = 1.1; // double(실수)
        System.out.println(b); // 1.1 출력

        //int c = "Hello World"; // int는 정수만 가능하기 때문에 c에 문자열을 담을 수 없음
        String c = "Hello World"; // String(문자열)
        System.out.println(c); // "Hello World" 출력

        // 즉, Java에서 변수를 만들 때는 해당 변수에 어떤 데이터 타입을 담을 수 있는지를 명확하게 표현해야 한다.
        // Java에서 변수에 데이터 타입을 설정하는 것은 해당 변수를 사용 할 때마다 변수 안에 들어간 값의 종류를 확인할 필요를 덜기 위함이다.
    }
}

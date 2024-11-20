package Java_OriginEducation.CH02_Operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열에도 `+` 연산자를 사용할 수 있다. 문자열에 `+` 연산자를 사용하면 두 문자를 연결한다.
        String result1 = "Hello" + "World";
        System.out.println(result1);

        String s1 = "String1";
        String s2 = "String2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자를 더할 수 있다. 이 때 숫자는 문자열로 바뀐 후 앞의 문자열과 연결된다.
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

        // Java는 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경한다. 즉, 문자열에 더하는 것은 다 문자열이 된다.
    }
}

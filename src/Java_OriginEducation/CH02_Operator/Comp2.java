package Java_OriginEducation.CH02_Operator;

public class Comp2 {
    public static void main(String[] args) {
        // 문자열 비교
        String str1 ="문자열1";
        String str2 ="문자열2";

        // 문자열은 비교될문자열.equals(비교할문자열)을 사용하여 비교한다.
        boolean result1 = "hello".equals("hello"); // 리터럴 - 리터럴 비교
        boolean result2 = str1.equals("문자열1"); // 문자열 변수 - 리터럴 비교
        boolean result3 = str1.equals(str2); // 문자열 변수 - 문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        // 세미콜론을 완성하는 단축키 ctrl + shift + enter
    }
}

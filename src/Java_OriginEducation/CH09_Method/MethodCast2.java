package Java_OriginEducation.CH09_Method;

public class MethodCast2 {

    public static void printNum (double n) {
        System.out.println("숫자 : " + n);
    }

    public static void main(String[] args) {
        int num = 100;
        printNum(100); // int -> double은 double이 더 큰 범위를 표현하기 때문에 자동 형변환되어 함수 호출 가능
    }
}

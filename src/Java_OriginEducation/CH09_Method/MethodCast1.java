package Java_OriginEducation.CH09_Method;

public class MethodCast1 {

    public static void printNum (int n) {
        System.out.println("숫자 : " + n);
    }

    public static void main(String[] args) {
        double num = 1.5;
        // printNum(num); // double -> int 타입 맞지않음 오류 발생
        printNum((int) num); // 명시적 형변환(double -> int) 후 호출 가능
    }
}

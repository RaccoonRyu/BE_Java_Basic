package Java_OriginEducation.CH06_TypeCast;

public class Cast2 {
    public static void main(String[] args) {
        double doubleVal = 1.5;
        int intVal = 0;

        //intVal = doubleVal; // 컴파일 오류 발생
        intVal = (int) doubleVal; // 개발자가 직접 변환할 타입을 입력하여 타입을 변환하는 명시적 형변환
        System.out.println("intVal = " + intVal); // 소숫점 아래가 절삭된 정수 1만 출력됨
        System.out.println("doubleVal = " + doubleVal);

        System.out.println(10.5); // 10.5
        System.out.println((int) 10.5); // 10
    }
}

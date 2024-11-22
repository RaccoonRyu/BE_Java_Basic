package Java_OriginEducation.CH06_TypeCast;

public class Cast1 {
    public static void main(String[] args) {
        int intVal = 10;
        long longVal;
        double doubleVal;
        
        // 작은 타입의 수를 큰 타입의 수에 넣는 것은 문제 없음 (묵시적, 자동 형변환)
        longVal = intVal; // int -> long
        System.out.println("longVal = " + longVal);
        
        doubleVal = intVal; // int -> double
        System.out.println("doubleVal = " + doubleVal);
        
        doubleVal = 20L; // long -> double
        System.out.println("doubleVal2 = " + doubleVal);

    }
}

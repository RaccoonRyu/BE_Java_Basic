package Java_OriginEducation.CH06_TypeCast;

public class Cast3 {
    public static void main(String[] args) {
        // 형변환과 Overflow

        long maxIntVal = 2147483647L; // int 최댓값
        long maxIntOver = 2147483648L; // int 최댓값 + 1 초과

        int intVal = 0;
        intVal = (int) maxIntVal;
        System.out.println("maxIntVal cast intVal = " + intVal); // int가 담을 수 있는 최댓값이므로 정상 형변환 및 출력

        intVal = (int) maxIntOver;
        System.out.println("maxIntOver cast intVal = " + intVal); // int가 담을 수 있는 최댓값보다 크므로 overflow 발생
    }
}

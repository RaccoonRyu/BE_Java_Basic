package Java_OriginEducation.CH04_Loop;

public class DoWhile1 {
    public static void main(String[] args) {
        // do-while

        int i = 10;

        do { // 조건이 참이든 거짓이든 일단 1회 수행. 참이면 해당 코드 블럭을 계속 실행하고, 거짓이면 탈출한다.
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 3);
    }
}

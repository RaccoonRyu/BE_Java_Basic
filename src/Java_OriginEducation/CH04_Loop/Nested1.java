package Java_OriginEducation.CH04_Loop;

public class Nested1 {
    public static void main(String[] args) {
        // 중첩 반복문 1 -> 중첩해서 반복문을 사용하면 곱하기로 수행할 수 있다.
        for (int i = 0; i < 2; i ++) {
            System.out.println("외부 for 시작 i : " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("내부 for i - j : " + i + " - " + j);
            }
            System.out.println("외부 for 종료 i : " + i);
            System.out.println();
        }
    }
}

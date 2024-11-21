package Java_OriginEducation.CH04_Loop;

public class NestedEx1 {
    public static void main(String[] args) {
        // 구구단 -> 중첩 for문
        // 외부 for문에서 n단을 결정하고, 내부 for문에서 반복하며 곱해줄 수를 결정한다. (ex 2단 x 2)
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}

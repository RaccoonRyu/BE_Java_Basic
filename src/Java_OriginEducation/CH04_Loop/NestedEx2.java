package Java_OriginEducation.CH04_Loop;

public class NestedEx2 {
    public static void main(String[] args) {
        // 중첩 for문을 사용한 별 찍기
        int rows = 5;

        for (int i = 0; i < rows; i++) { // 행 수만큼 반복하기 위한 외부 반복문
            for (int j = 0; j <= i; j++) { // 외부 반복문의 count 수 만큼(j <= i) 별을 찍기 위한 내부 반복문
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

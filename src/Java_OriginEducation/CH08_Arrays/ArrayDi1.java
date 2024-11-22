package Java_OriginEducation.CH08_Arrays;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 2차원 배열 (2x3) - for문을 사용한 출력 리팩토링
        // 배열 생성
        int[][] arr = new int[2][3]; // 행은 2, 열은 3

        // 배열의 요소 값 대입
        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2; // 0행 1열
        arr[0][2] = 3; // 0행 2열
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5; // 1행 1열
        arr[1][2] = 6; // 1행 2열

        // for문을 사용하여 행을 출력
        for (int i = 0; i < 2; i++) {
            // 행은 0, 1로만 접근하면 되므로, 행 자리에 i를 대입하여 for문을 수행한다.
            System.out.print(arr[i][0] + " "); // 0열 출력
            System.out.print(arr[i][1] + " "); // 1열 출력
            System.out.print(arr[i][2] + " "); // 2열 출력
            System.out.println();
        }
    }
}

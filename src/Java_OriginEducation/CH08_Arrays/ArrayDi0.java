package Java_OriginEducation.CH08_Arrays;

public class ArrayDi0 {
    public static void main(String[] args) {
        // 2차원 배열 (2x3)
        // 배열 생성
        int[][] arr = new int[2][3]; // 행은 2, 열은 3

        // 배열의 요소 값 대입
        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2; // 0행 1열
        arr[0][2] = 3; // 0행 2열
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5; // 1행 1열
        arr[1][2] = 6; // 1행 2열

        // 출력 (0행 전체 출력)
        System.out.print(arr[0][0] + " "); // 0열 출력
        System.out.print(arr[0][1] + " "); // 1열 출력
        System.out.print(arr[0][2] + " "); // 2열 출력
        System.out.println(); // 한 행 끝나면 개행

        // 출력 (1행 전체 출력)
        System.out.print(arr[1][0] + " "); // 0열 출력
        System.out.print(arr[1][1] + " "); // 1열 출력
        System.out.print(arr[1][2] + " "); // 2열 출력
    }
}

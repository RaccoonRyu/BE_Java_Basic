package Java_OriginEducation.CH08_Arrays;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 2차원 배열 (2x3) - for문을 사용한 출력 리팩토링
        // 배열 생성
        int[][] arr = new int[2][3]; // 행은 2, 열은 3
        // 1차원 배열처럼 바로 {{},{}} 형식으로 생성과 동시에 값을 넣어 초기화할 수 있다.

        // 배열의 요소 값 대입
        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2; // 0행 1열
        arr[0][2] = 3; // 0행 2열
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5; // 1행 1열
        arr[1][2] = 6; // 1행 2열

        // for문을 사용하여 행과 열을 함께 출력
        for (int row = 0; row < arr.length; row++) { // 행을 탐색. arr.length : 2차원 배열 행의 길이
            for (int column = 0; column < arr[row].length; column++) { // 열을 탐색. arr[row].length : 2차원 배열 열의 길이
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}

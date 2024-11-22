package Java_OriginEducation.CH08_Arrays;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2차원 배열 (2x3) - for문을 사용한 출력 리팩토링
        // 배열 생성
        int[][] arr = new int[2][3]; // 행은 2, 열은 3
        // 1차원 배열처럼 {{},{}} 형식으로 생성과 동시에 값을 넣어 초기화할 수 있다. (ex int[][] arr = {{}, {}};)

        // 배열의 길이와 2중 for문 이용하여 요소 값 대입
        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++; // 후위 증감 연산자를 사용하여 값을 먼저 대입한 다음 증가
            }
        }

        // 2중 for문을 사용하여 행과 열을 함께 출력
        for (int row = 0; row < arr.length; row++) { // 행을 탐색. arr.length : 2차원 배열 행의 길이
            for (int column = 0; column < arr[row].length; column++) { // 열을 탐색. arr[row].length : 2차원 배열 열의 길이
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}

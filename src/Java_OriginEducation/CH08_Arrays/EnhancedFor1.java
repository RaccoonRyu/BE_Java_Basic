package Java_OriginEducation.CH08_Arrays;

public class EnhancedFor1 {
    public static void main(String[] args) {
        // 향상된 for문 (for-each)

        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 향상된 for문(for-each)
        for (int num : numbers) { // 변수 : 배열 - 오른쪽 배열의 처음부터 끝까지 모든 값을 탐색하고, 탐색할 때 마다 각 요소를 왼쪽 변수에 담는 행위를 반복한다.
            System.out.println(num);
        }

        // 향상된 for문을 사용할 수 없는 경우 : for loop 안에서 증가하는 index 값이 필요할 때(ex index 값의 출력)
    }
}

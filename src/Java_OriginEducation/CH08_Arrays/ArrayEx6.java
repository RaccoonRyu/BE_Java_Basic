package Java_OriginEducation.CH08_Arrays;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요 : ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        int minVal, maxVal;

        System.out.print(size + "개의 정수를 입력하세요. : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        minVal = nums[0];
        maxVal = nums[0];

        for (int i = 1; i < nums.length; i++) { // 최소,최댓값을 배열 첫번째로 대입했기 때문에 배열 두번째 항목부터 비교 시작
            if(nums[i] < minVal) {
                minVal = nums[i];
            }

            if(nums[i] > maxVal) {
                maxVal = nums[i];
            }
        }

        System.out.println("가장 작은 정수 : " + minVal);
        System.out.println("가장 큰 정수 : " + maxVal);
    }
}

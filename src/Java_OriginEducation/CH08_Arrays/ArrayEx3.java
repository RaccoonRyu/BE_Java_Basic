package Java_OriginEducation.CH08_Arrays;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.print("5개의 정수를 입력하세요. : ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("역방향 출력 : ");
        for (int i = nums.length - 1; i >= 0; i--) {
            if(i != 0) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i]);
            }
        }
    }
}
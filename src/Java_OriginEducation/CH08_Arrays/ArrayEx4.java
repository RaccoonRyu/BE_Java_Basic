package Java_OriginEducation.CH08_Arrays;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        int sum = 0;

        System.out.print("5개의 정수를 입력하세요. : ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + (double) sum / nums.length);
    }
}

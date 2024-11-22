package Java_OriginEducation.CH08_Arrays;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요 : ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        int sum = 0;

        System.out.print(size + "개의 정수를 입력하세요. : ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + (double) sum / size);
    }
}

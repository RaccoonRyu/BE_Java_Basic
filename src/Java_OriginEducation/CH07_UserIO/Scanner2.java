package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        // Scanner 예제
        // 두 수 더하는 덧셈기
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요. : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요. : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("두 숫자의 합은 : " + sum);
    }
}

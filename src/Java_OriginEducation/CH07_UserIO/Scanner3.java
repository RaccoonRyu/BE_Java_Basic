package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        // Scanner로 입력받은 두 수 비교
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요. : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요. : ");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println("첫 번째 숫자가 두 번째 숫자보다 더 큽니다. " + num1);
        } else if (num1 < num2) {
            System.out.println("두 번째 숫자가 첫 번째 숫자보다 더 큽니다. " + num2);
        } else {
            System.out.println("두 숫자는 동일합니다.");
        }
    }
}

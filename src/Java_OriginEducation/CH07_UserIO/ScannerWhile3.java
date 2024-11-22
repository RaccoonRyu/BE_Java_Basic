package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        // Scanner를 이용하여 프로그램이 종료될 때 까지 사용자가 입력한 모든 정수의 합 출력 / 0 입력시 종료
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요. (0을 입력하면 종료) : ");
            int num = sc.nextInt();
            sum += num;

            if(num == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        System.out.println("입력한 수의 총 합 : " + sum);
    }
}

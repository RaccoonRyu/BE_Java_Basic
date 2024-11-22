package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        // Scanner를 이용해 두 숫자를 입력하고 두 숫자를 더해서 출력 / 두 숫자 모두 0이면 프로그램 종료
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();

            if(num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("입력한 두 수의 합 : " + (num1 + num2));
        }
    }
}

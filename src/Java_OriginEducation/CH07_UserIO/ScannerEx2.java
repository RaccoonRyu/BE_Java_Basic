package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요. : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력한 숫자 " + num + "은 짝수입니다.");
        } else {
            System.out.println("입력한 숫자 " + num + "은 홀수입니다.");
        }
    }
}

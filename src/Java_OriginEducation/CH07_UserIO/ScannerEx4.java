package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("구구단을 출력할 숫자를 입력해주세요. : ");
        int num = sc.nextInt();

        System.out.println(num + "단의 구구단");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

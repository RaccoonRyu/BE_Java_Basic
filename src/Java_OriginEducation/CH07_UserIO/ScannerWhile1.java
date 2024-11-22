package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        // Scanner를 통해 탈출 문자열을 입력받기 전까지 계속 프로그램이 작동하도록 작성
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("문자열을 입력하세요. (exit를 입력하면 종료) : ");
            String str = sc.nextLine();

            if("exit".equals(str)) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 : " + str);
        }
    }
}

package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요. (종료를 입력하면 종료) : ");
            String name = sc.nextLine();

            if("종료".equals(name)) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt(); // nextInt는 개행문자를 포함하지 않아 입력에 남아있음. 따라서 다음에 반복될 nextLine()에서 개행문자를 읽어 문제를 일으킨다.
            sc.nextLine(); // 따라서 nextLine()을 그냥 수행하면 남은 개행문자를 읽어서 비워주고, 다음 반복 시 문제를 일으키지 않는다.

            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);
        }
    }
}

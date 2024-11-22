package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner; // java.util의 Scanner를 가져다 씀 (import)

public class Scanner1 {
    public static void main(String[] args) {
        // 사용자 입력을 받기 위한 Scanner 클래스
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요. : ");
        String str = sc.nextLine(); // 사용자 입력을 String으로 가져온다.

        System.out.println("입력한 문자열 : " + str);

        // 정수 입력
        System.out.print("정수를 입력하세요. : ");
        int intVal = sc.nextInt();
        System.out.println("입력한 정수 : " + intVal);

        // 실수 입력
        System.out.print("실수를 입력하세요. : ");
        double doubleVal = sc.nextDouble();
        System.out.println("입력한 실수 : " + doubleVal);
    }
}

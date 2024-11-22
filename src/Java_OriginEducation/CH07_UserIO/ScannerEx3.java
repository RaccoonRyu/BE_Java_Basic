package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요. : ");
        String name = sc.nextLine();
        System.out.print("음식 가격을 입력해주세요. : ");
        int price = sc.nextInt();
        System.out.print("음식 수량을 입력해주세요. : ");
        int nums = sc.nextInt();

        System.out.println(name + " " + nums + "개를 주문하셨습니다. 총 가격은 " + (price * nums) + "원 입니다.");

    }
}

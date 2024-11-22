package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("상품의 가격을 입력하세요. (-1을 입력하면 종료) : ");
            int price = sc.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("상품의 수량을 입력하세요 : ");
            int goods = sc.nextInt();

            sum = price * goods;
            System.out.println("총 비용 : " + sum);
        }
    }
}

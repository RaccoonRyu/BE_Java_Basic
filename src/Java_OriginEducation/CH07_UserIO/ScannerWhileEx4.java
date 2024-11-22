package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
            int selectNum = sc.nextInt();
            sc.nextLine();

            if(selectNum == 1) {
                System.out.print("상품 명을 입력하세요. : ");
                String name = sc.nextLine();
                System.out.print("상품 가격을 입력하세요. : ");
                int price = sc.nextInt();
                System.out.print("상품 수량을 입력하세요. : ");
                int quan = sc.nextInt();

                sum += price * quan;
                System.out.println("상품명 : " + name + " 가격 : " + price + " 수량 : " + quan + " 합계 : " + price * quan);
            } else if (selectNum == 2) {
                System.out.println("총 비용 : " + sum);
                sum = 0;
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
}

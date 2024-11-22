package Java_OriginEducation.CH08_Arrays;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요. :");
            int selectNum = sc.nextInt();
            sc.nextLine();

            if (selectNum == 1) {

                if(productCount >= 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue; // 사용자가 2번이나 3번을 선택할 수 있도록 continue
                }

                System.out.print("상품 이름을 입력하세요.");
                productNames[productCount] = sc.nextLine(); // index 0 자리에 데이터 입력
                System.out.print("상품 가격을 입력하세요.");
                productPrices[productCount] = sc.nextInt(); // index 0 자리에 데이터 입력

                productCount++; // 다음 index에 상품을 입력하기 위해 count 증가
            } else if (selectNum == 2) {

                if(productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue; // 사용자가 2번이나 3번을 선택할 수 있도록 continue
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i] + "원");
                }
            } else if (selectNum == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다..");
            }
        }
    }
}

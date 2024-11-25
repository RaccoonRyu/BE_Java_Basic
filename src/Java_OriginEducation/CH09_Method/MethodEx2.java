package Java_OriginEducation.CH09_Method;

import java.util.Scanner;

public class MethodEx2 {

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
        return balance;
    }

    public static int withDraw(int balance, int amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려했으나 잔액이 부족합니다.");
        }

        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("--------------------------------------");
            int selectNum = sc.nextInt();

            // 아래 로직은 스위치로 작성해도 된다.
            if(selectNum == 1) {
                System.out.println("선택 : " + selectNum);
                System.out.print("입금액을 입력하세요. : ");
                int depoAmount = sc.nextInt();
                balance = deposit(balance, depoAmount);
            } else if (selectNum == 2) {
                System.out.println("선택 : " + selectNum);
                System.out.print("입금액을 입력하세요. : ");
                int withDrawAmount = sc.nextInt();
                balance = withDraw(balance, withDrawAmount);
            } else if (selectNum == 3) {
                System.out.println("선택 : " + selectNum);
                System.out.println("현재 잔액 : " + balance + "원");
            } else if (selectNum == 4){
                System.out.println("선택 : " + selectNum);
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }
}

package Java_OriginEducation.CH09_Method;

public class MethodEx1 {

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
        int balance = 10000;
        balance = deposit(balance, 1000);
        balance = withDraw(balance, 2000);
        System.out.println("최종 잔액 : " + balance);

    }
}

package Java_OriginEducation.CH03_Conditions;

public class If4 {
    public static void main(String[] args) {
        // 개별 if문 vs if-else if문

        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액 : " + discount + "원");

        int price2 = 1000;
        int age2 = 10;
        int discount2 = 0;

        if (price2 >= 10000) {
            discount2 += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age2 <= 10) {
            discount2 += 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액 : " + discount2 + "원");
    }
}

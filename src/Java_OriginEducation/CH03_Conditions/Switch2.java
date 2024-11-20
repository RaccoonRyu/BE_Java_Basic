package Java_OriginEducation.CH03_Conditions;

public class Switch2 {
    public static void main(String[] args) {
        // switch 문 break 없다면?
        int grade = 2;

        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000; // case 2에 break문이 없어서 grade가 2이든 3이든 case 3의 문장이 수행됨
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 : " + coupon);
    }
}

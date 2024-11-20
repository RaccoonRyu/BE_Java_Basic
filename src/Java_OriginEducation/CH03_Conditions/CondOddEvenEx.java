package Java_OriginEducation.CH03_Conditions;

public class CondOddEvenEx {
    public static void main(String[] args) {
        int x = 3;
        String oddEven = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + ", " + oddEven);
    }
}

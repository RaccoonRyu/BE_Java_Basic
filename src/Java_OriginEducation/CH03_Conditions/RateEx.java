package Java_OriginEducation.CH03_Conditions;

public class RateEx {
    public static void main(String[] args) {
        double rate = 7.1;

        if (rate <= 9) {
            System.out.println("어바웃 타임을 추천합니다.");
        }

        if (rate <= 8) {
            System.out.println("토이 스토리를 추천합니다.");
        }

        if (rate <= 7) {
            System.out.println("고질라를 추천합니다.");
        }
    }
}

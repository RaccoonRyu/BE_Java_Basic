package Java_OriginEducation.CH09_Method;

public class MethodReturn2 {

    public static void checkAge(int age) {
        if(age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가합니다.");
            return;
        }

        System.out.println(age + "살, 입장하세요.");
    }

    public static void main(String[] args) {
        checkAge(10);
    }
}

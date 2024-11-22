package Java_OriginEducation.CH07_UserIO;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0; // 교환을 위한 임시 저장용 변수 temp

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + ", " + b);

    }
}

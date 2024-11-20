package Java_OriginEducation.CH03_Conditions;

public class CondOp1 {
    public static void main(String[] args) {
        // 삼항(조건) 연산자

        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자"; // 조건식 ? 참반환 : 거짓반환 -> 항이 총 3개
        System.out.println(status);
    }
}

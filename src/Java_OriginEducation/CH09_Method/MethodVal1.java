package Java_OriginEducation.CH09_Method;

public class MethodVal1 {
    // Java의 대원칙
    // 자바는 항상 변수의 값을 복사해서 대입한다.
    // 이는 기본형이든 참조형이든 동일하다. 매우 중요!!!

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2 : " + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2 : " + num2);
    }

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1 : " + num1);
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1 : " + num1); // 10이 아닌 5 출력에 유의!!!
    }
}

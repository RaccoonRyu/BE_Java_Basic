package Java_OriginEducation.CH09_Method;

public class MethodVal3 {
    // Java의 대원칙
    // 자바는 항상 변수의 값을 읽고, 이를 복사해서 대입한다.
    // 이는 기본형이든 참조형(이 때는 참조값)이든 동일하다. 매우 중요!!!

    public static int changeNumber(int num1) {
        num1 = num1 * 2;
        return num1;
    }

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1 : " + num1);
        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1 : " + num1); // 10이 아닌 5 출력에 유의!!!
    }
}



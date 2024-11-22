package Java_OriginEducation.CH05_LocalVarScope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;

        for (int i = 0; i < 2; i++) { // 블록 내부, int i의 생존 범위는 for문 내(초기식에 직접 변수 선언이 가능)
            System.out.println("for m = " + m); // 블록 내부에서 외부는 접근 가능
            System.out.println("for i = " + i);
        } // i 생존 종료

        System.out.println("main m = " + m);
        //System.out.println("main i = " + i); // cannot find symbol
    }
}

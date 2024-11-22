package Java_OriginEducation.CH05_LocalVarScope;

public class Scope1 {
    public static void main(String[] args) {
        // 지역 변수와 스코프
        int m = 10; // m 변수 생존 시작

        if(true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료 (아래 라인부터 사용 불가)

        //System.out.println("main x = " + x); // x 변수는 더 이상 사용할 수 없기 때문에 cannot find symbol 컴파일 에러
        System.out.println("main m = " + m); // m 변수는 사용 가능

    } // m 생존 종료
}

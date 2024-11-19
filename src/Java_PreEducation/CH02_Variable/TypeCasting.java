package Java_PreEducation.CH02_Variable;

public class TypeCasting {
    public static void main(String[] args) {
        // 데이터 타입의 변환
        double a = 1.1;
        double b = 1;
        System.out.println(b); // 정수 1이 값 손실 없이 double로 오토 캐스팅 되므로 Error가 아닌 1.0이 출력

        //int c = 1.1; // double 형은 int로 오토 캐스팅 되지 않아 Error 발생
        double d = 1.1; // int를 double로 바꾸거나,
        int e = (int) 1.1; // double형의 값을 int형으로 강제 변환하는 코드 삽입하여 형 변환 가능
        System.out.println(e); // 1 출력 (강제 변환 시 값의 손실이 있음)

        // 수동-자동 캐스팅은

        // int to String
        String intStr = Integer.toString(1); // int 1을 String으로 형변환
        System.out.println(intStr); // 문자열 1 출력
        System.out.println(intStr.getClass()); // .getClass() : intStr의 데이터 타입 출력

    }
}

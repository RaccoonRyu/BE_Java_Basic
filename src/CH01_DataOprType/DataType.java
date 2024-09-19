package CH01_DataOprType;

public class DataType {
    public static void main(String[] args) {
        // Java에서 숫자, 문자 같은 데이터를 코드로 표현하는 방법 -> 데이터 타입

        // 숫자 - 표현하려는 내용 그대로 작성
        System.out.println(6);

        // 문자열 (String) - 포현하려는 내용 양 옆으로 큰 따옴표를 븉여 작성
        System.out.println("six");
        System.out.println("6"); // 숫자가 아닌 문자 6

        System.out.println(6+6); // 12 (숫자) - 숫자 간의 합연산
        System.out.println("6"+"6"); // 66 (문자열) - 문자열 간의 결합연산
        System.out.println(6*6); // 36 (숫자) - 숫자 간의 곱연산
        //System.out.println("6"*"6"); // Error - 문자열은 곱연산이 불가능함

        System.out.println("1111".length()); // 문자열의 길이를 계산하는 length() 함수. 4 출력
        //System.out.println(1111.length()); // Error - 숫자는 길이를 계산하는 length() 함수가 없음

        // 이런 자료형마다 구분이 중요한 이유는 각 데이터 타입에 어울리는(필요로 하는) 연산 방법이 다르기 때문
        // 따라서 데이터 타입을 구분하는 이유는 데이터 타입 별로 각 타입에 어울리는 연산 방법이 있기 때문에 엄격한 구분이 필요하다.
    }
}

package Java_PreEducation.CH04_InputOutput;

public class InputOutput_argu_param {
    public static void main(String[] args) {
        // 입력과 출력 - arguments & parameter

        // 프로그램이 실행될 때 입력 값을 받는 가장 표준적인 방법 - args 매개 변수(parameter)
        // 1. '실행 설정 구성'(Run/Debug Configurations)에서 '프로그램 인수'(Program Arguments)란에 입력 값을 공백으로 구분하여 작성한다.
        // 여러 인수를 입력할 경우, 공백으로 구분된 각 값이 개별적인 인수로 처리된다.
        // 2. 해당 입력 값은 main 함수의 args 매개변수로 전달되며, 이는 문자열 배열 형태로 사용된다 (String[] args).
        // 배열의 각 요소는 입력한 프로그램 인수에 해당한다.

        // 입력과 출력 - argument/parameter
        String id = args[0]; // 문자열 배열의 첫 번째 요소는 0
        String address = args[1]; // 문자열 배열의 첫 번째 요소는 1
        System.out.println("동 : "+id+"\n우편번호 : "+address); // 사용자가 실행 설정 구성에 입력한 값을 출력
    }
}

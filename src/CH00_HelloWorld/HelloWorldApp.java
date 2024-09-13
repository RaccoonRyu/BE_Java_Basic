package CH00_HelloWorld;

public class HelloWorldApp { // 앱을 실행하기 위해, 파일명과 클래스명은 동일해야 한다.
    public static void main(String[] args) { // 앱 실행 시 JVM은 가장 먼저 약속된 이름인 main 메서드를 찾음

        System.out.println("Hello World!"); // 콘솔 화면에 Hello World! 라는 문장을 출력하는 코드

    } // 이후 정상적으로 main 메서드를 찾으면 main 메서드의 중괄호 안에 위치한 코드를 실행한다.
} // 해당 자바 파일을 저장하면 .java 파일을 컴파일한 동일한 이름의 .class 파일을 생성한다.(보통 Explorer에서는 감춰진다.)
  // .java 파일 : 사람이 읽고 쓸 수 있는 소스 코드가 저장됨
  // .class 파일 : .java를 저장 시 컴파일이라는 과정을 거쳐 컴퓨터(JVM)가 실행하는 바이트 코드가 저장됨

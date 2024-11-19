package Java_PreEducation.CH03_Debugger;

public class Debugger {
    public static void main(String[] args) {
        // Debugger
        // 코드의 의도하지 않은 문제를 bug(버그)라고 한다
        // 이런 버그를 잡는 행위를 debugging(디버깅) 이라고 하며, 이 때 사용하는 도구를 debugger(디버거)라고 한다.

        // 해당 코드의 라인 수를 클릭하여 디버깅 위한 중단점 생성
        // 이 때 실행은 디버그 모드로 실행해야 중단점을 사용할 수 있다.
        // 디버그 모드로 실행하면 중단점을 생성한 코드에서 실행이 멈추고, 해당 코드를 실행하는 순간의 변수 상태를 하나하나 확인할 수 있다.
        String debug1 = "디버그 1";
        System.out.println(debug1);

        String debug2 = "디버그 2";
        System.out.println(debug2);

        // step over : 디버깅 중인 앱의 현재 코드를 실행하고 다음 줄로 이동
        // step into : 디버깅 중인 앱의 현재 코드에서 호출되는 메서드 내부로 이동
        // step out : 현재 디버깅 중인 메서드를 끝까지 실행한 후 메서드를 호출한 코드로 이동
        // play 버튼 : 다음 중단점이 나올 때 까지 모든 코드 실행
        // 중지 버튼 : debugging 종료
    }
}

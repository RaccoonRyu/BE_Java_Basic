package Java_PreEducation.CH04_InputOutput;

import javax.swing.*;

public class InputOutput {
    public static void main(String[] args) {
        // 입력과 출력
        // 프로그램은 들어오는 입력을 처리해서 출력으로 만드는 것
        // 입력에는 Argument(text 정보), File, Network, Audio, Program이 있음
        // 출력에는 Monitor(화면), File, Audio, Program이 있다.

        // 텍스트 정보를 입력할 수 있는 팝업을 출력하는 swing 패키지의 JOptionPane 클래스(Import 필요)
        // 팝업에 입력한 텍스트 정보는 String 타입의 id 변수에 저장됨
        String id = JOptionPane.showInputDialog("ID를 입력해주세요.");
        String address = JOptionPane.showInputDialog("우편번호를 입력해주세요.");
        System.out.println("동 : "+id+"\n우편번호 : "+address); // 사용자가 입력한 값을 출력

    }
}

package Java_OriginEducation.CH08_Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        // 1차원 배열
        // 배열 : 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것

        // 배열 변수 선언 : 타입[] 변수명으로 배열 변수 선언
        int[] students;
        students = new int[5]; // int형 배열을 길이 5로 생성하여 배열 변수 students에 대입

        // 배열 요소의 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        //students[5] = 50; // 예외 발생 - ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        // 배열 요소 값 접근 및 사용(출력)
        System.out.println("학생 1 점수 : " + students[0]);
        System.out.println("학생 2 점수 : " + students[1]);
        System.out.println("학생 3 점수 : " + students[2]);
        System.out.println("학생 4 점수 : " + students[3]);
        System.out.println("학생 5 점수 : " + students[4]);

        // for문을 사용한 배열 요소 값 접근 및 사용(출력)
        for (int i = 0; i < students.length; i++) { // 배열변수명.length : 배열의 길이를 반환
            System.out.println("학생 " + (i + 1) +" 점수 : " + students[i]);
        }

    }
}

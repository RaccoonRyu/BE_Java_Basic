package Java_OriginEducation.CH08_Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        // 1차원 배열 - 배열의 선언과 생성, 초기화를 한번에 수행하여 리팩토링
        // 배열 : 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것

        // 물론 배열은 선언과 생성, 초기화를 한번에 수행할 수 있다.
        // students라는 배열 변수를 선언하고, int형 배열을 생성하여 배열 변수 students에 대입하고, 생성과 동시에 값을 초기화 (이 때 배열의 길이는 뺌)
        int[] students = new int[]{90, 80, 70, 60, 50};


        // for문을 사용한 배열 요소 값 접근 및 사용(출력)
        for (int i = 0; i < students.length; i++) { // 배열변수명.length : 배열의 길이를 반환
            System.out.println("학생 " + (i + 1) +" 점수 : " + students[i]);
        }

    }
}

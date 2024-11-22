package Java_OriginEducation.CH08_Arrays;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력해주세요. : ");
        int size = sc.nextInt();
        
        int[][] scores = new int[size][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < size; i++) { // 행
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요.");
            for (int j = 0; j < 3; j++) { // 열
                System.out.print(subjects[j] + "점수 : ");
                scores[i][j] = sc.nextInt();
            }
        } // 행 하나당 과목 점수를 총 세번씩 입력

        for (int i = 0; i < size; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j]; // i번째 학생의 j번째 과목 점수
            }
            double avg = total / 3.0;
            System.out.println((i + 1) + "번 학생의 총점 : " + total + ", 평균 : " + avg);
        }
    }
}

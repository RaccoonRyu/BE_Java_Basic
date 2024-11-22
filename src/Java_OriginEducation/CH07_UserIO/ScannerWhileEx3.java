package Java_OriginEducation.CH07_UserIO;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");
        while (true) { // while((input = sc.nextInt()) != -1)로 고쳐도 된다.
            int num = sc.nextInt();

            if(num == -1) {
                break;
            }

            sum += num;
            input++;
        }

        avg = (double) sum / input; // 소숫점 아래까지 확인해야하므로 앞에 (double)로 명시적 형변환

        System.out.println("입력한 숫자들의 총합 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + avg);
    }
}

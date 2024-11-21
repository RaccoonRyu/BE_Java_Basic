package Java_OriginEducation.CH04_Loop;

public class Continue1 {
    public static void main(String[] args) {
        // continue
        // while, do-while, for 모든 반복문에서 사용 가능
        int i = 1;

        while (i <= 5) {

            if(i == 3) {
                i++;
                continue; // 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는데 사용
            }

            System.out.println("i = " + i);
            i++;
        }
    }
}

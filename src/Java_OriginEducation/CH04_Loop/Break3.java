package Java_OriginEducation.CH04_Loop;

public class Break3 {
    public static void main(String[] args) {
        // for문, break문을 사용하여 sum이 10을 초과했을 때 탈출!
        int sum = 0;

        for (int i = 1; ; i++) { // for문에 초기식과 증감식을 추가하여 while 대비 카운터 변화에 대한 가독성이 좋게 작성할 수 있음!
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 : i = " + i + ", sum = " + sum);
                break;
            }
        } // for문을 사용하는 이유는 카운터 변수가 명확하거나 반복 횟수가 정해진 경우 유지보수 및 코드 파악이 편리하기 때문!
    }
}

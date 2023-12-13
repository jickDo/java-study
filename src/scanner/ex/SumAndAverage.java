package scanner.ex;

import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double cnt = 0;
        System.out.println("숫자를 입력하세요 중단하고 싶다면 -1 를 눌러주세요");
        while(true){
            int num = scanner.nextInt();
            if (num==-1){
                break;
            }
            sum+=num;
            cnt++;
        }
        System.out.println("입력한 숫자들의 합계 : " +sum);
        System.out.println("입력한 숫자들의 평균 : " +sum/cnt);
    }
}

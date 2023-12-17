package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int sum=0;
        double average = 0;

        System.out.println("입력받을 숫자의 갯수를 입력하세요");
        int count = scanner.nextInt();

        System.out.println(count+"개의 정수를 입력하세요");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
            sum+=array[i];
        }
        System.out.println("총합은: "+sum);
        average=(double) sum/ count;
        System.out.println("평균은: "+average);
    }
}

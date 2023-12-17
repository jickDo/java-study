package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int sum=0;
        double average = 0;
        System.out.println("5개의 정수를 입력하세요");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum+=array[i];
        }
        System.out.println("총합은: "+sum);
        average=(double) sum/ array.length;
        System.out.println("평균은: "+average);
    }
}

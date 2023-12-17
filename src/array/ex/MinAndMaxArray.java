package array.ex;

import java.util.Scanner;

public class MinAndMaxArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];

        System.out.println(count + "개의 숫자를 입력하세요");
        for (int i = 0; i < count; i++) {
            array[i]=scanner.nextInt();
        }

        int minNumber, maxNumber;

        minNumber = maxNumber = array[0];
        for (int i =1 ;i<count;i++ ){
             if( array[i]<minNumber){
                 minNumber=array[i];
             }
             if (array[i]>maxNumber){
                 maxNumber = array[i];
             }
        }

        System.out.println("가장 작은 정수: "+minNumber);
        System.out.println("가장 큰 정수: "+maxNumber);
    }
}

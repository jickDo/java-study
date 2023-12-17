package array.ex;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = new int[5];
        System.out.println("5개의 정수를 입력하세요");
        for(int i=0; i< array.length; i++){
            array[i]=scanner.nextInt();
        }

        for(int j=0; j< array.length; j++){
            if (j== array.length-1){
                System.out.print(array[array.length-1]);
                break;
            }
            System.out.print(array[j]+", ");
        }
    }
}

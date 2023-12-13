package scanner.ex;

import java.util.Scanner;

public class ChangeSideNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tmp;

        System.out.print("첫번째 값을 입력하세요");
        int num1= scanner.nextInt();


        System.out.print("두번째 값을 입력하세요");
        int num2= scanner.nextInt();

        if (num1>num2){
            tmp=num1;
            num1=num2;
            num2=tmp;
        }

        while(num1<=num2){
            System.out.println(num1);
            num1++;
        }

    }
}

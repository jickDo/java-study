package scanner.ex;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        while (true) {
            System.out.print("첫번째 수를 입력하세요: ");
            int first = scanner.nextInt();

            System.out.print("첫번째 수를 입력하세요: ");
            int second = scanner.nextInt();

            if (first == 0 && second == 0) {
                System.out.print("프로그램을 종료합니다. ");
                break;
            }
            else{
                sum= first+ second;
                System.out.println("두 변수의 합은?: " + sum);
            }
        }

    }}

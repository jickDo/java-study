package scanner.ex;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int dummy;
        while(true){
            System.out.print("입력값을 정해주세요");
            dummy= scanner.nextInt();
            if (dummy==0){
                System.out.println("지금 까지 합은?: " + sum);
                break;
            }
            sum+=dummy;

        }
    }
}

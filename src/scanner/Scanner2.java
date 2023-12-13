package scanner;

import java.util.Scanner;

public class Scanner2 {


    public static void main(String[] args) {
        Scanner scannerFirst = new Scanner(System.in);


        System.out.print("첫번째 수를 입력하세요");
        int numFirst = scannerFirst.nextInt();

        System.out.print("두번째 수를 입력하세요");
        int numSecond = scannerFirst.nextInt();
        int sum= numFirst + numSecond;
        System.out.println("총 합은 "+ sum);
    }
}

package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요");
        String str = scanner.nextLine();
        System.out.println(str);

        System.out.print("문자열을 입력하세요");
        int num = scanner.nextInt();
        System.out.println(num);

        System.out.print("실수를 입력하세요");
        Double doubleNum = scanner.nextDouble();
        System.out.println(doubleNum);
    }
}

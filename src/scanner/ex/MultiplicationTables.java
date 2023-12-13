package scanner.ex;

import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.print("원하는 단을 선택하세요");
        int num = scanner.nextInt();

        for (int start=1; start<=9; start++){
            System.out.println(num+" * "+start+ " = "+ start*num);
        }
    }
}

package scanner.ex;

import java.util.Objects;
import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.print("사용자는 입력을 넣어주세요 ");
            String input = scanner.nextLine();

            if(input.equals("exit")){
                System.out.println("시스템을 종료합니다: ");
                break;
            }

            System.out.println(input);
        }
    }
}

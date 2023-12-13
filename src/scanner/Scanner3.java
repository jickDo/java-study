package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 값을 입력하세요");
        int numFirst= scanner.nextInt();

        System.out.print("두번째 값을 입력하세요");
        int numSecond= scanner.nextInt();

        if (numFirst>numSecond){
            System.out.println(numFirst);
        }else if(numFirst<numSecond){
            System.out.println(numSecond);
        }else{
            System.out.println("두 숫자는 같습니다");
        }

    }
}

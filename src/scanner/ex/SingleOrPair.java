package scanner.ex;

import java.util.Scanner;

public class SingleOrPair {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 수를 입력하세요");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println("짝수입니다");
        }else if(num%2!=0){
            System.out.println("홀수입니다");
        }else{
            System.out.println("그런수는 없습니다");
        }
    }
}

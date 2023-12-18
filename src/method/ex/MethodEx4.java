package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int options;
        int balance=0;
        while(true){
            System.out.println("--------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("--------------------");
            options= scanner.nextInt();

            if (options==1){
                balance=deposit(balance);
            } else if (options==2) {
                balance=withdraw(balance);
            } else if (options==3) {
                checkAccount(balance);
            } else if (options==4) {
                System.out.println("프로그램을 종료합니다");
                break;
            }else {
                System.out.println("그런 숫자는 지원안합니다.");
            }


        }

    }

    public static int deposit(int balance){

        System.out.print("입금액을 선택하세요");
        int money= scanner.nextInt();
        balance+=money;

        System.out.println(money+"원을 입금했습니다. 현재 잔액: "+ balance);
        return balance;
    }

    public static int withdraw(int balance){
        System.out.print("출금액을 선택하세요");
        int money= scanner.nextInt();

        if (balance>=money){
        balance-=money;
            System.out.println(money+"원을 출금했습니다. 현재 잔액: "+ balance);
    }else{
            System.out.println(money+"원을 출금하려고 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    public static void checkAccount(int balance){
        System.out.println("현재 잔액: "+ balance);
    }

    public static void endTest(){
        System.out.println("프로그램을 종료합니다.");
    }
}

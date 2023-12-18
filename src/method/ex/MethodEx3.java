package method.ex;

public class MethodEx3 {

    public static void main(String[] args){
        int balance = 10000;
        balance=deposit(balance,1000);
        System.out.println("================");
        balance=withdraw(balance,2000);

    }

    public static int deposit(int balance,int number){
        balance+=number;
        System.out.println("현재 잔액 : "+ balance);
        return balance;
    }

    public static int withdraw(int balance,int number){
        if (balance>=number){
        balance-=number;
            System.out.println("현재 잔액 : "+ balance);
    }else{
            System.out.println("잔액부족");
        }
        return balance;
    }
}

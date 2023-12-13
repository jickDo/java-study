package scanner.ex;

import java.util.Scanner;

public class StoreEx {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total= 0;
        while(true){
            System.out.println("1 : 상품입력, 2 : 결제, 3 : 프로그램 종료");
            String option = scanner.nextLine();

            if(option.equals("1")){
                System.out.print("상품명을 입력하세요");
                String name = scanner.nextLine();
                System.out.print("상품가격을 입력하세요");
                int price = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요");
                int quantity = scanner.nextInt();
                total+=quantity*price;
                System.out.println("상품명은 : "+name+" 가격: "+price+" 수량: "+quantity+ " 합계 "+ quantity*price);
                scanner.nextLine();
            }
            else if(option.equals("2")){
                System.out.println("총 비용은: "+total);
                total =0;
            }
            else {
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }
    }
}

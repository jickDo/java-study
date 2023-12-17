package array.ex;

import java.util.Scanner;

public class ProductArrayEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;
        int options;


        while(true){
            System.out.println("1. 상품등록  |  2. 상품목록  | 3. 종료");
            System.out.print("메뉴를 선택하세요");
            options = scanner.nextInt();
            scanner.nextLine();
            if (options == 1){
                if (productCount>10){
                    System.out.println("최대 보유 수량 초과");
                    continue;
                }
                System.out.println("상품의 이름을 입력하세요");
                productNames[productCount]=scanner.nextLine();

                System.out.println("상품의 가격을 입력하세요");
                productPrices[productCount]=scanner.nextInt();

                productCount++;
            } else if (options == 2) {
                if (productCount==0){
                    System.out.println("등록된 상품이 없습니다");
                    continue;
                }
                for (int i=0; i<productCount; i++){
                    System.out.println(productNames[i]+": "+productPrices[i]+"원");
                }
            }
            else if(options==3){
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }

    }
}

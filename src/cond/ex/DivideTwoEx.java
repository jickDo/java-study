package cond.ex;

public class DivideTwoEx {

    public static void main(String[] args) {
        int x = 3;

        if (x % 2==0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }

        String result = (x%2==0) ? "짝수" : "홀수";
        System.out.println(result);
    }
}

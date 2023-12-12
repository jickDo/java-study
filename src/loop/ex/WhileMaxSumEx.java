package loop.ex;

public class WhileMaxSumEx {

    public static void main(String[] args) {
        int max = 5;
        int i = 1;
        int sum = 0;
        while(i<=max){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

}

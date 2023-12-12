package loop.ex;

public class ForMaxSumEx {

    public static void main(String[] args) {

        int max = 5;
        int sum = 0;
        for(int i=1; i<=max; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

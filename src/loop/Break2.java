package loop;

public class Break2 {

    public static void main(String[] args) {
        int start =1;
        int sum = 0;
        for(;;){
            if (sum>=10){
                System.out.println("현재 합은?: " + sum);
                break;
            }
            sum+=start;
            start++;
        }
    }
}
